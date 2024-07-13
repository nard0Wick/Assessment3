package com.Metaphorce.task.controllers;

import com.Metaphorce.task.models.Todo;
import com.Metaphorce.task.services.ITodoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    private final ITodoService todoService;

    public TodoController(ITodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/all")
    public List<Todo> getTodo() {
        return todoService.findAll();
    }

    @PostMapping("/add")
    public ResponseEntity<Object> registrarTodo (@RequestBody Todo todo) {
        return ResponseEntity.ok(todoService.save(todo));
    }

    @PutMapping("/update/{TodoID}")
    public ResponseEntity<Object> actualizarTodo (@RequestBody Todo todo, @PathVariable("TodoID") Long id) {
        return ResponseEntity.ok(todoService.update(todo, id));
    }

    @DeleteMapping(path = "/delete/{TodoID}")
    public ResponseEntity<Object> eliminarTodo(@PathVariable("TodoID") Long id) {
        todoService.delete(id);
        return ResponseEntity.ok("Todo Deleted!");
    }

}