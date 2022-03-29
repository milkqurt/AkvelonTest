package com.example.TestAkvelon.Model;

import com.example.TestAkvelon.Entity.StatusTask;
import com.example.TestAkvelon.Entity.TaskEntity;

public class TaskModel {
    private Long id;
    private String name;
    private String description;
    private StatusTask status;

    public static TaskModel toModel(TaskEntity entity) {
        TaskModel model = new TaskModel();
        model.setId(entity.getId());
        model.setName(entity.getName());
        model.setDescription(entity.getDescription());
        model.setStatus(entity.getStatus());
        return model;
    }

    public TaskModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public StatusTask getStatus() {
        return status;
    }

    public void setStatus(StatusTask status) {
        this.status = status;
    }
}
