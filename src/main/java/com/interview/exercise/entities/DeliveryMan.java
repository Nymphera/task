package com.interview.exercise.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class DeliveryMan {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String lastName;
    @OneToMany
    private List<Package> packages;
}
