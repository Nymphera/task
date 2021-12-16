package com.interview.exercise.controller;

import com.interview.exercise.Repository.PackageRepository;
import com.interview.exercise.model.UserDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/packages")
@AllArgsConstructor

public class PackageController {

    private PackageRepository packageRepository;


    @GetMapping("/all")
    public List<Package> getAllPackagesInSystem() {
        return packageRepository.findAll();
    }
}
