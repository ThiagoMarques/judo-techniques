package com.thiagomarques.controller.dto;

import com.thiagomarques.domain.model.JudoThrow;

public class JudoThrowDto {
    private Long id;
    private String name;
    private String description;
    private String videoUrl;
    private String imageUrl;

    public JudoThrowDto() {
    }

    public JudoThrowDto(Long id, String name, String description, String videoUrl, String imageUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.videoUrl = videoUrl;
        this.imageUrl = imageUrl;
    }

    public JudoThrow toModel() {
        JudoThrow model = new JudoThrow();
        model.setId(this.id);
        model.setName(this.name);
        model.setDescription(this.description);
        model.setVideo_url(this.videoUrl);
        model.setImage_url(this.imageUrl);
        return model;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
