package com.thiagomarques.service.impl;

import com.thiagomarques.domain.model.JudoThrow;
import com.thiagomarques.repository.JudoThrowRepository;
import com.thiagomarques.service.JudoThrowService;
import com.thiagomarques.service.exception.BusinessException;
import com.thiagomarques.service.exception.NotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class JudoThrowServiceImpl implements JudoThrowService {

    private final JudoThrowRepository judoThrowRepository;

    public JudoThrowServiceImpl(JudoThrowRepository judoThrowRepository) {
        this.judoThrowRepository = judoThrowRepository;
    }

    @Transactional(readOnly = true)
    public List<JudoThrow> findAll() {
        return this.judoThrowRepository.findAll();
    }

    @Transactional(readOnly = true)
    public JudoThrow findById(Long id) {
        return this.judoThrowRepository.findById(id).orElseThrow(NotFoundException::new);
    }

    @Transactional
    public JudoThrow create(JudoThrow judoThrowToCreate) {
        return this.judoThrowRepository.save(judoThrowToCreate);
    }

    @Transactional
    public JudoThrow update(Long id, JudoThrow judoThrowToUpdate) {
        JudoThrow dbJudoThrow = this.findById(id);
        
        if (!dbJudoThrow.getId().equals(judoThrowToUpdate.getId())) {
            throw new BusinessException("Update IDs must be the same.");
        }
        
        dbJudoThrow.setName(judoThrowToUpdate.getName());
        dbJudoThrow.setVideoUrl(judoThrowToUpdate.getVideoUrl());
        dbJudoThrow.setImageUrl(judoThrowToUpdate.getImageUrl());
        dbJudoThrow.setDescription(judoThrowToUpdate.getDescription());
        
        return this.judoThrowRepository.save(dbJudoThrow);
    }
    

    @Transactional
    public void delete(Long id) {
        JudoThrow dbJudoThrow = this.findById(id);
        this.judoThrowRepository.delete(dbJudoThrow);
    }
}
