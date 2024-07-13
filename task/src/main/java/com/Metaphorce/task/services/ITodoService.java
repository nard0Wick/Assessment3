package com.Metaphorce.task.services;

import com.Metaphorce.task.models.Todo;

import java.util.List;

public interface ITodoService {
    List<Todo> findAll();
    List<Todo> findAllCompleted();
    Todo save(Todo todo);
    Todo update(Todo todo, Long id);
    void delete(Long id);
}
