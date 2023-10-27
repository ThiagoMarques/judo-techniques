package com.thiagomarques.controller.dto;

import com.thiagomarques.domain.model.JudoThrow;

public record JudoThrowDto(Long id, String name, String videoUrl, String imageUrl, String description, String groupName) {

    public JudoThrowDto(JudoThrow model) {
        this(model.getId(), model.getName(), model.getVideoUrl(), model.getImageUrl(), model.getDescription(), model.getGroupName());
    }

    public JudoThrow toModel() {
        JudoThrow model = new JudoThrow();
        model.setId(this.id);
        model.setName(this.name);
        model.setVideoUrl(this.videoUrl);
        model.setImageUrl(this.imageUrl);
        model.setDescription(this.description);
        model.setGroupName(this.groupName);
        return model;
    }
}
