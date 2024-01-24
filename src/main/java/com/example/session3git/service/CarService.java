package com.example.session3git.service;

import com.example.session3git.model.Car;
import com.example.session3git.repository.CarRepository;
import com.example.session3git.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    public CarRepository carRepository;


    public List<Car> getCarList () {
            return carRepository.getCarList ( );
    }

    public void createCar ( Car car ) {
        carRepository.createCar ( car );
    }
}
