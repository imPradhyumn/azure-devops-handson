package com.impradhyumn.todo_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.impradhyumn.todo_backend.models.ToDo;

@Repository
public interface ToDoRepository extends JpaRepository<ToDo, Long> {

}