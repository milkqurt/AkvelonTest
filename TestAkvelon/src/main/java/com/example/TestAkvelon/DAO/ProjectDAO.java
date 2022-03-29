package com.example.TestAkvelon.DAO;


import com.example.TestAkvelon.Entity.ProjectEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProjectDAO extends CrudRepository<ProjectEntity,Long> {
    ProjectEntity findByName(String name);
}
