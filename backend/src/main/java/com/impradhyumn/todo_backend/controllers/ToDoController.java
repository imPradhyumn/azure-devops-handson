package com.impradhyumn.todo_backend.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.impradhyumn.todo_backend.models.ToDo;
import com.impradhyumn.todo_backend.service.IToDoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/todo")
@CrossOrigin(origins = "*")
public class ToDoController {

    @Autowired
    private IToDoService toDoService;

    @GetMapping("/get-all")
    public ResponseEntity<List<ToDo>> getToDos() {
        return ResponseEntity.ok(toDoService.getAllTasks());
    }

}
