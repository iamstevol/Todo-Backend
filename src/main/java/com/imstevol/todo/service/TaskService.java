package com.imstevol.todo.service;

import com.imstevol.todo.dto.request.TaskRequestDto;
import com.imstevol.todo.dto.response.TaskResponseDto;

import java.util.List;

public interface TaskService {

    TaskResponseDto createTask(TaskRequestDto requestDto);

    List<TaskResponseDto> getAllTask();
}
