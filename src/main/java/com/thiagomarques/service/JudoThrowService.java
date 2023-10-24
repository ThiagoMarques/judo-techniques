package com.thiagomarques.service;

import com.thiagomarques.domain.model.JudoThrow;

public interface JudoThrowService {
    JudoThrow findById(Long id);
    JudoThrow create(JudoThrow throwCreate);
}
