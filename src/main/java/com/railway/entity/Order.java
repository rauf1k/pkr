package com.railway.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table("orders")
public class Order {
    @Id
    private Long id;
    private Long ticketId;
    private String status;
    private LocalDateTime createdAt;
}
