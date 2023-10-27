package com.thiagomarques.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.thiagomarques.controller.dto.JudoThrowDto;
import com.thiagomarques.service.JudoThrowService;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@RequestMapping("/judothrows")
public record JudoThrowController(JudoThrowService judoThrowService) {

    @GetMapping
    public ResponseEntity<List<JudoThrowDto>> findAll() {
        var judoThrows = judoThrowService.findAll();
        var judoThrowsDto = judoThrows.stream().map(JudoThrowDto::new).collect(Collectors.toList());
        return ResponseEntity.ok(judoThrowsDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<JudoThrowDto> findById(@PathVariable Long id) {
        var judoThrow = judoThrowService.findById(id);
        return ResponseEntity.ok(new JudoThrowDto(judoThrow));
    }

    @PostMapping
    public ResponseEntity<JudoThrowDto> create(@RequestBody JudoThrowDto judoThrowDto) {
        var judoThrow = judoThrowService.create(judoThrowDto.toModel());
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(judoThrow.getId())
                .toUri();
        return ResponseEntity.created(location).body(new JudoThrowDto(judoThrow));
    }

    @PutMapping("/{id}")
    public ResponseEntity<JudoThrowDto> update(@PathVariable Long id, @RequestBody JudoThrowDto judoThrowDto) {
        var judoThrow = judoThrowService.update(id, judoThrowDto.toModel());
        return ResponseEntity.ok(new JudoThrowDto(judoThrow));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        judoThrowService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
