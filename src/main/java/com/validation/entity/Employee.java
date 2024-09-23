package com.validation.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "last_name")
    private String lastName;

    private String email;
    private Long phone;
    private byte age;
    private double height;
    private boolean married;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @ManyToOne(targetEntity = Departament.class, cascade = CascadeType.PERSIST)
    private Departament departament;
}
