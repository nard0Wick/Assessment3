package com.Metaphorce.task.services.Implements;

import com.Metaphorce.task.models.Todo;
import com.Metaphorce.task.repositories.TodoRepository;
import com.Metaphorce.task.services.ITodoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService implements ITodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    @Override
    public List<Todo> findAllCompleted() {
        return null;
    }

    @Override
    public Todo save(Todo todo) {
        return null;
    }

    @Override
    public Todo update(Todo todo) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
