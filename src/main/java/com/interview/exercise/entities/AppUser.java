package com.interview.exercise.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class AppUser {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String lastName;
    private String company;
    private LocalDateTime insertTime;
    @OneToOne
    private Role role;
    @OneToMany
    public List<Package> aPackage;
}
