package com.te.ems.entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Technology {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer technologyId;
    @Column(unique = true)
    private String technologyName;
}
