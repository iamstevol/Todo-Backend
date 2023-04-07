package com.imstevol.todo.entity;

import com.imstevol.todo.enums.Status;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TodoTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id", nullable = false)
    private Long taskId;

    private String name;
    private String description;
    private Status status;
    @CreationTimestamp
    private LocalDateTime start;

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

