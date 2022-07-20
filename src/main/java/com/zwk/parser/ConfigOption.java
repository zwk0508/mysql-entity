package com.zwk.parser;

public class ConfigOption {
    private String location;
    private String tablePrefix;
    private String packageName;
    private String mappingLocation;

    public ConfigOption() {
    }

    public ConfigOption(String location, String tablePrefix, String packageName, String mappingLocation) {
        this.location = location;
        this.tablePrefix = tablePrefix;
        this.packageName = packageName;
        this.mappingLocation = mappingLocation;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTablePrefix() {
        return tablePrefix;
    }

    public void setTablePrefix(String tablePrefix) {
        this.tablePrefix = tablePrefix;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getMappingLocation() {
        return mappingLocation;
    }

    public void setMappingLocation(String mappingLocation) {
        this.mappingLocation = mappingLocation;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {
        private String location;
        private String tablePrefix;
        private String packageName;
        private String mappingLocation;

        public Builder location(String location) {
            this.location = location;
            return this;
        }

        public Builder tablePrefix(String tablePrefix) {
            this.tablePrefix = tablePrefix;
            return this;
        }

        public Builder packageName(String packageName) {
            this.packageName = packageName;
            return this;
        }

        public Builder mappingLocation(String mappingLocation) {
            this.mappingLocation = mappingLocation;
            return this;
        }

        public ConfigOption build() {
            return new ConfigOption(location, tablePrefix, packageName, mappingLocation);
        }
    }
}
