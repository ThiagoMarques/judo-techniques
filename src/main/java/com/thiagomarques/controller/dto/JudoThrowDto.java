package com.thiagomarques.controller.dto;

import com.thiagomarques.domain.model.JudoThrow;

public record JudoThrowDto(Long id, String name, String videoUrl, String imageUrl, String description) {

    public JudoThrowDto(JudoThrow model) {
        this(model.getId(), model.getName(), model.getVideoUrl(), model.getImageUrl(), model.getDescription());
    }

    public JudoThrow toModel() {
        JudoThrow model = new JudoThrow();
        model.setId(this.id);
        model.setName(this.name);
        model.setVideoUrl(this.videoUrl);
        model.setImageUrl(this.imageUrl);
        model.setDescription(this.description);
        return model;
    }
}
