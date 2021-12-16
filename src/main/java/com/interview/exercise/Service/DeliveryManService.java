package com.interview.exercise.Service;

import com.interview.exercise.Repository.PackageRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class DeliveryManService {

    PackageRepository packageRepository;

    public void assignPackageToDeliveryMan(long packageId) {
        Optional<Package> packageToAssign = packageRepository.findById(packageId);
        //assing ifPresent && delievery not assigned yet
    }
}
