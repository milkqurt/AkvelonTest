package com.example.TestAkvelon.Controller;


import com.example.TestAkvelon.Entity.ProjectEntity;
import com.example.TestAkvelon.Exception.TaskExists;
import com.example.TestAkvelon.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping
    public ResponseEntity addProject(@RequestBody ProjectEntity project) {
        try {
            projectService.addProject(project);
            return ResponseEntity.ok("project added successfully");
        } catch (TaskExists e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("An error has occurred");
        }
    }
    @PutMapping
    public ResponseEntity updateProject(@RequestBody Long id){
        try{
            return ResponseEntity.ok(projectService.updateProject(id));
        }catch (Exception exception){
            return ResponseEntity.badRequest().body("");
        }
    }

    @GetMapping
    public ResponseEntity getProjectId(@RequestParam Long id) {
        try {
            return ResponseEntity.ok(projectService.getProjectId(id));
        } catch (TaskExists e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("An error has occurred");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteProject(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(projectService.delete(id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("An error has occurred");
        }
    }
}