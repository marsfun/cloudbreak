package com.sequenceiq.cloudbreak.api.model;

import java.util.Map;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sequenceiq.cloudbreak.doc.ModelDescriptions.FileSystem;

import io.swagger.annotations.ApiModelProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class FileSystemBase implements JsonEntity {

    @NotNull
    @ApiModelProperty(value = FileSystem.NAME, required = true)
    private String name;

    @NotNull
    @ApiModelProperty(value = FileSystem.TYPE, required = true)
    private FileSystemType type;

    @ApiModelProperty(FileSystem.DEFAULT)
    private boolean defaultFs;

    @ApiModelProperty(FileSystem.PROPERTIES)
    private Map<String, String> properties;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FileSystemType getType() {
        return type;
    }

    public void setType(FileSystemType type) {
        this.type = type;
    }

    public boolean isDefaultFs() {
        return defaultFs;
    }

    public void setDefaultFs(boolean defaultFs) {
        this.defaultFs = defaultFs;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }
}
