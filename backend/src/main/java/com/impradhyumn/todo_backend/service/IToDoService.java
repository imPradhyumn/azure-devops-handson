package com.impradhyumn.todo_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.impradhyumn.todo_backend.models.ToDo;

@Service
public interface IToDoService {

    List<ToDo> getAllTasks();
}
