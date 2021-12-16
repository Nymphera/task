package com.interview.exercise.entities;

import com.interview.exercise.entities.AppUser;
import lombok.Data;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
@Getter
public class Package {

    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    private AppUser PackageUserToDeliveryFrom;
    @ManyToOne
    private DeliveryMan deliveryMan;

}
