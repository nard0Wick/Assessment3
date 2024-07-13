// File: TodoController.java
package com.Metaphorce.task.controllers;

import com.Metaphorce.task.services.Implements.TodoService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.List;

import com.Metaphorce.task.models.Todo;
import com.Metaphorce.task.services.Implements.TodoService;

@RestController
@RequestMapping("/api/todos")
public class TodoController {
@Autowired
private TodoService todoService;
// TODO: Implement REST endpoints for CRUD operations

@Autowired
    public TodoController(TodoService TodoService)
    {
        this.todoService = todoService;
    }

    @GetMapping("/all")
    public List<Todo> getTodo()
    {
        return this.todoService.findAll();
    }


    @PostMapping("/add")
    public ResponseEntity<Object> registrarTodo (@RequestBody Todo Todo)
    {
        return this.TodoService.newTodo(Todo);
    }

    @PutMapping("/update/{TodoID}")
    public ResponseEntity<Object> actualizarTodo (@RequestBody Todo Todo, @PathVariable("TodoID") Long id)
    {
        return this.TodoService.updateTodo(Todo, id);
    }

    @DeleteMapping(path = "/delete/{TodoID}")
    public ResponseEntity<Object> eliminarTodo(@PathVariable("TodoID") Long id)
    {
        return this.TodoService.deleteTodo(id);
    }



}