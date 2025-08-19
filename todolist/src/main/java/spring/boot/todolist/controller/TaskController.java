package spring.boot.todolist.controller;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.boot.todolist.model.Task;
import spring.boot.todolist.repository.TaskRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/task")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @GetMapping("/id")
    public ResponseEntity<Task> getTaskById(@RequestParam Long id) {

        Optional<Task> task = taskRepository.findById(id);
        return task.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
        Task savedTask = taskRepository.save(task);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedTask);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody Task taskDetail) {
        Optional<Task> task = taskRepository.findById(id);
        if (task.isPresent()) {
            Task existingTask = task.get();
            existingTask.setTitle(taskDetail.getTitle());
            existingTask.setTitle(taskDetail.getDescription());
            existingTask.setCompleted(taskDetail.isCompleted());

            Task updatedTask = taskRepository.save(existingTask);
            return ResponseEntity.ok(updatedTask);
        } else {

            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/id")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
       Optional<Task> task = taskRepository.findById(id);
       if (task.isPresent()) {
           taskRepository.delete(task.get());
           return ResponseEntity.noContent().build();
       } else {
           return ResponseEntity.notFound().build();
       }
    }
}
