package com.thiagomarques.domain.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "judo_kyo")
public class JudoKyo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "judoKyo", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<JudoThrow> throwList;

       public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<JudoThrow> getThrowList() {
        return throwList;
    }

    public void setThrowList(List<JudoThrow> throwList) {
        this.throwList = throwList;
    }
}