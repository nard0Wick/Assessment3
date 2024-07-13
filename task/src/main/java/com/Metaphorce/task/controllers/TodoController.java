<<<<<<< HEAD
// File: TodoController.java
package com.Metaphorce.task.controllers;

import com.Metaphorce.task.services.Implements.TodoService;


import org.springframework.beans.factory.annotation.Autowired;
=======
package com.Metaphorce.task.controllers;

import com.Metaphorce.task.models.Todo;
import com.Metaphorce.task.services.ITodoService;
>>>>>>> 46092bdc99d6663757cd34dbcc41b53235aab727
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

<<<<<<< HEAD
import com.Metaphorce.task.models.Todo;
import com.Metaphorce.task.services.Implements.TodoService;
=======
import java.util.List;
>>>>>>> 46092bdc99d6663757cd34dbcc41b53235aab727

@RestController
@RequestMapping("/api/todos")
public class TodoController {

<<<<<<< HEAD
@Autowired
    public TodoController(TodoService TodoService)
    {
=======
    private final ITodoService todoService;

    public TodoController(ITodoService todoService) {
>>>>>>> 46092bdc99d6663757cd34dbcc41b53235aab727
        this.todoService = todoService;
    }

    @GetMapping("/all")
<<<<<<< HEAD
    public List<Todo> getTodo()
    {
        return this.todoService.findAll();
=======
    public List<Todo> getTodo() {
        return todoService.findAll();
>>>>>>> 46092bdc99d6663757cd34dbcc41b53235aab727
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