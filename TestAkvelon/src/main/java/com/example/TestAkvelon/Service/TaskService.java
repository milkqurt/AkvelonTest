package com.example.TestAkvelon.Service;

import com.example.TestAkvelon.DAO.ProjectDAO;
import com.example.TestAkvelon.DAO.TaskDAO;
import com.example.TestAkvelon.Entity.ProjectEntity;
import com.example.TestAkvelon.Entity.TaskEntity;
import com.example.TestAkvelon.Model.TaskModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Autowired
    private TaskDAO taskDAO;
    @Autowired
    private ProjectDAO projectDAO;

    public TaskModel addTask(TaskEntity task, Long prodId) {
        ProjectEntity project = projectDAO.findById(prodId).get();
        task.setProject(project);
        return TaskModel.toModel(taskDAO.save(task));
    }

    public TaskModel update(Long id) {
        TaskEntity task = taskDAO.findById(id).get();
        return TaskModel.toModel(taskDAO.save(task));
    }
}
