package com.expressian.carrental.repositories;

import com.expressian.carrental.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Long> {
}
