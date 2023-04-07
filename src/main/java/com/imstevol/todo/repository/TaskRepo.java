package com.imstevol.todo.repository;

import com.imstevol.todo.entity.TodoTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<TodoTask, Long>{

}
