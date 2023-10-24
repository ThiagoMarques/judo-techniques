package com.thiagomarques.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.thiagomarques.domain.model.JudoThrow;
import com.thiagomarques.service.JudoThrowService;

@RestController
@RequestMapping("/throw")

public class JudoThrowController {
    private final JudoThrowService judoThrowService;

    public JudoThrowController(JudoThrowService judoThrowService) {
        this.judoThrowService = judoThrowService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<JudoThrow> findById(@PathVariable Long id) {
        var judoThrow = judoThrowService.findById(id);
        return ResponseEntity.ok(judoThrow);
    }

    @PostMapping
    public ResponseEntity<JudoThrow> create(@RequestBody JudoThrow judoThrowCreate) {
        var judoThrowCreated = judoThrowService.create(judoThrowCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
        .path("/{id}")
        .buildAndExpand(judoThrowCreated.getId())
        .toUri();
        return ResponseEntity.created(location).body(judoThrowCreated);
    }
}
