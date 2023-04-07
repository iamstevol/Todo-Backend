package com.imstevol.todo.service.implementation;

import com.imstevol.todo.dto.request.TaskRequestDto;
import com.imstevol.todo.dto.response.TaskResponseDto;
import com.imstevol.todo.entity.TodoTask;
import com.imstevol.todo.repository.TaskRepo;
import com.imstevol.todo.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {
    private final TaskRepo taskRepo;

    @Override
    public TaskResponseDto createTask(TaskRequestDto requestDto) {
        TodoTask task = TodoTask.builder()
                .name(requestDto.getName())
                .description(requestDto.getDescription())
                .status(requestDto.getStatus())
                .start(LocalDateTime.now())
                .build();

        TodoTask savedTask = taskRepo.save(task);

        return mapToDto(savedTask);
    }

    @Override
    public List<TaskResponseDto> getAllTask() {
        List<TodoTask> allTask = taskRepo.findAll();
        return allTask.stream().map(this::mapToDto).collect(Collectors.toList());
    }

    public TaskResponseDto mapToDto(TodoTask task) {
        return TaskResponseDto.builder()
                .status(task.getStatus())
                .description(task.getDescription())
                .name(task.getName()).build();
    }

}
