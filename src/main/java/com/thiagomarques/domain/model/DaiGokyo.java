package com.thiagomarques.domain.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity(name = "tb_dai_gokyo")
public class DaiGokyo {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private Technique group; // Campo para identificar a que grupo de técnica ela pertence

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<JudoThrow> throwList;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Technique getGroup() {
        return group;
    }

    public void setGroup(Technique group) {
        this.group = group;
    }

    public List<JudoThrow> getThrowList() {
        return throwList;
    }

    public void setThrowList(List<JudoThrow> throwList) {
        this.throwList = throwList;
    }
}
