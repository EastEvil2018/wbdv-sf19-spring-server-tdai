package com.example.wbdvsf19tdaiserverjava.models;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String id;
    private String title;
    private List<Module> modules;
    
    public Course() {
    	this.modules = new ArrayList<Module>();
    }
    
    public Course(String id) {
    	this.id = id;
    	this.title = "Default Title";
    	this.modules = new ArrayList<Module>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }
}