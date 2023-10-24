package com.thiagomarques.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.thiagomarques.domain.model.JudoThrow;
import com.thiagomarques.repository.JudoThrowRepository;
import com.thiagomarques.service.JudoThrowService;

@Service
public class JudoThrowImpl implements JudoThrowService {

    private final JudoThrowRepository judoThrowRepository;

    public JudoThrowImpl(JudoThrowRepository judoThrowRepository) {
        this.judoThrowRepository = judoThrowRepository;
    }

    @Override
    public JudoThrow findById(Long id) {
        return judoThrowRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public JudoThrow create(JudoThrow judoThrow) {
        if (judoThrow.getId() == null) {
            return judoThrowRepository.save(judoThrow);
        } else {
            throw new IllegalArgumentException("Cannot create a JudoThrow with a specified ID. Use update instead.");
        }
    }

}
