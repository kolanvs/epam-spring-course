package com.kolanvs.epamtutor.beans;

import java.util.List;

public class Project {
    private String name;
    private List<Object> engineers;

    public Project() {
    }

    public Project(String name, List<Object> engineers) {
        this.name = name;
        this.engineers = engineers;
        System.out.println("i'm from Project constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Object> getEngineers() {
        return engineers;
    }

    public void setEngineers(List<Object> engineers) {
        this.engineers = engineers;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", engineers=" + engineers +
                '}';
    }

    public void initProject() {
        System.out.println("Check budget for " + engineers.size() + " engineers");
        System.out.println("Check staging");
    }
}
