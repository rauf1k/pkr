package com.railway.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table("passengers")
public class Passenger {
    @Id
    private Long id;
    private String name;
    private String email;
    private String phone;
}
