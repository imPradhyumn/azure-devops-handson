package com.impradhyumn.todo_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.impradhyumn.todo_backend.models.ToDo;
import com.impradhyumn.todo_backend.repository.ToDoRepository;

@Service
public class TaskServiceImpl implements IToDoService {

    @Autowired
    private ToDoRepository toDoRepo;

    public List<ToDo> getAllTasks() {

        return toDoRepo.findAll();
    }
}
