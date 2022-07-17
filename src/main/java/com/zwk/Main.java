package com.zwk;

import com.zwk.antlr.MySqlLexer;
import com.zwk.antlr.MySqlParser;
import com.zwk.parser.CreateTable;
import com.zwk.parser.CreateTableVisitor;
import com.zwk.parser.EntityGenerator;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    /**
     * -l location 生成entity的位置
     * -tp tablePrefix 去除掉的表名前缀
     * -p  package 包
     * 最后跟上sql文件位置
     */
    public static void main(String[] args) throws Exception {
        if (args == null || args.length == 0) {
            return;
        }
        int length = args.length;
        int paramLen = length - 1;
        String filePath = args[paramLen];
        String location = null;
        String tablePrefix = null;
        String packageName = null;
        int i = 0;
        while (i < paramLen) {
            String arg = args[i];
            switch (arg) {
                case "-l":
                    if (i + 1 < paramLen) {
                        location = args[i + 1];
                    }
                    break;
                case "-tp":
                    if (i + 1 < paramLen) {
                        tablePrefix = args[i + 1];
                    }
                    break;
                case "-p":
                    if (i + 1 < paramLen) {
                        packageName = args[i + 1];
                    }
                    break;
                default:
            }
            i += 2;
        }
        generate(filePath, location, tablePrefix, packageName);
    }

    public static void generate(String filePath, String location, String tablePrefix, String packageName) throws IOException {
        generate(new FileInputStream(filePath), location, tablePrefix, packageName);
    }

    public static void generate(File file, String location, String tablePrefix, String packageName) throws IOException {
        generate(new FileInputStream(file), location, tablePrefix, packageName);
    }

    public static void generate(InputStream inputStream, String location, String tablePrefix, String packageName) throws IOException {
        new EntityGenerator(getCreateTable(inputStream), location, tablePrefix, packageName).generate();
    }

    private static CreateTable getCreateTable(InputStream inputStream) throws IOException {
        CharStream stream = CharStreams.fromStream(inputStream);
        TokenStream input = new CommonTokenStream(new MySqlLexer(stream));
        MySqlParser mySqlParser = new MySqlParser(input);
        MySqlParser.RootContext root = mySqlParser.root();
        CreateTableVisitor visitor = new CreateTableVisitor();
        visitor.visit(root);
        return visitor.getCreateTable();
    }

}
