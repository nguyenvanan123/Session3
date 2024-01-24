package com.example.session3git.repository;

import com.example.session3git.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarRepository {

    List<Car> list = new ArrayList<> ( );

    public CarRepository () {
        Car car1 = new Car ( 1, "Cr-V", "hybird", 1500 );
        Car car2 = new Car ( 2, "Santafe", "xang", 1500 );
        Car car3 = new Car ( 3, "Everest", "dau", 1500 );
        Car car4 = new Car ( 4, "CX-8", "hybird", 1200 );

        list.add ( car1 );
        list.add ( car2 );
        list.add ( car3 );
        list.add ( car4 );
    }

    public List<Car> getCarList () {
        return list;
    }

    public void createCar ( Car car ) {
        list.add ( car );
    }
}
