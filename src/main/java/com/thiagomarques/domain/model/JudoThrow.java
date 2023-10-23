package com.thiagomarques.domain.model;

public class JudoThrow {
    private String name;
    private String description;
    private String video_url;
    private String image_url;

    public JudoThrow(String name, String description, String video_url, String image_url) {
        this.name = name;
        this.description = description;
        this.video_url = video_url;
        this.image_url = image_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
}
