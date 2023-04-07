package com.imstevol.todo.dto.response;

import com.imstevol.todo.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaskResponseDto {
    private String name;
    private String description;
    private Status status;
}
