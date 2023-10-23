package com.thiagomarques.domain.model;

import java.util.List;

public class JudoKyo {
    private String name;
    private List<JudoThrow> throwList; 

    public JudoKyo(String name, List<JudoThrow> throwList) {
        this.name = name;
        this.throwList = throwList;
    }

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