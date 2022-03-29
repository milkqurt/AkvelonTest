package com.example.TestAkvelon.Controller;


import com.example.TestAkvelon.Entity.TaskEntity;
import com.example.TestAkvelon.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @PostMapping
    public ResponseEntity addTask(@RequestBody TaskEntity task,
                                     @RequestParam Long projectId) {
        try {
            return ResponseEntity.ok(taskService.addTask(task, projectId));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("An error has occurred");
        }
    }

    @PutMapping
    public ResponseEntity updateTask(@RequestParam Long id) {
        try {
            return ResponseEntity.ok(taskService.update(id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("An error has occurred");
        }
    }
}