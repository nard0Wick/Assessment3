package com.Metaphorce.task.services.Implements;

import com.Metaphorce.task.models.Todo;
import com.Metaphorce.task.repositories.TodoRepository;
import com.Metaphorce.task.services.ITodoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
        return todoRepository.findAll().stream().filter(t ->
                t.isCompleted() == true).collect(Collectors.toList());
    }

    @Override
    public Todo save(Todo todo) {
        return todoRepository.save(todo);
    }

    @Override
<<<<<<< HEAD
    public Todo update(Todo todo) {
        return todoRepository.save(todo);
=======
    public Todo update(Todo todo, Long id) {
        return null;
>>>>>>> 46092bdc99d6663757cd34dbcc41b53235aab727
    }

    @Override
    public void delete(Long id) {
        todoRepository.delete(findAll().stream().filter(t ->
                t.getId().equals(id)).findFirst().orElseThrow());
    }
}
