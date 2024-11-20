package com.railway.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table("trains")
public class Train {
    @Id
    private Long id;
    private String trainNumber;
    private Integer totalSeats;
    private String route;
}
