package com.example.TestAkvelon.DAO;


import com.example.TestAkvelon.Entity.TaskEntity;
import org.springframework.data.repository.CrudRepository;

public interface TaskDAO extends CrudRepository<TaskEntity,Long> {
}
