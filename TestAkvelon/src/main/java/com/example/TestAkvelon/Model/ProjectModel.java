package com.example.TestAkvelon.Model;

import com.example.TestAkvelon.Entity.ProjectEntity;
import com.example.TestAkvelon.Entity.Status;

import java.util.List;
import java.util.stream.Collectors;

public class ProjectModel {
    private Long id;
    private String name;
    private String start;
    private String completion;
    private Status status;
    private List<TaskModel> tasks;

    public static ProjectModel toModel(ProjectEntity entity) {
        ProjectModel model = new ProjectModel();
        model.setId(entity.getId());
        model.setName(entity.getName());
        model.setStart(entity.getStart());
        model.setCompletion(entity.getCompletion());
        model.setStatus(entity.getStatus());
        model.setTasks(entity.getTasks().stream().map(TaskModel::toModel).collect(Collectors.toList()));
        return model;
    }

    public ProjectModel() {
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

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getCompletion() {
        return completion;
    }

    public void setCompletion(String completion) {
        this.completion = completion;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<TaskModel> getTasks() {
        return tasks;
    }

    public void setTasks(List<TaskModel> tasks) {
        this.tasks = tasks;
    }
}
