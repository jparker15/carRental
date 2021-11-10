package com.expressian.carrental.controllers;

import com.expressian.carrental.models.Car;
import com.expressian.carrental.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {
    @Autowired
    private CarRepository repository;

    @GetMapping
    public @ResponseBody List<Car> getCars(){return repository.findAll();}
}
