package com.example.TestAkvelon.Service;

import com.example.TestAkvelon.DAO.ProjectDAO;
import com.example.TestAkvelon.Entity.ProjectEntity;
import com.example.TestAkvelon.Exception.TaskExists;
import com.example.TestAkvelon.Model.ProjectModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectDAO projectDAO;

    public ProjectEntity addProject(ProjectEntity project) throws TaskExists {
        if (projectDAO.findByName(project.getName()) != null) {
            throw new TaskExists("a project with the same name already exists");
        }
        return projectDAO.save(project);
    }

    public ProjectModel getProjectId(Long id) throws TaskExists {
        ProjectEntity project = projectDAO.findById(id).get();
        if (project == null) {
            throw new TaskExists("project not found");
        }
        return ProjectModel.toModel(project);
    }

    public Long delete(Long id) {
        projectDAO.deleteById(id);
        return id;
    }

    public ProjectEntity updateProject(Long id){
        ProjectEntity project = projectDAO.findById(id).get();
        return projectDAO.save(project);
    }
}