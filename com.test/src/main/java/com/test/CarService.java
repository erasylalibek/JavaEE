package com.test;

import com.test.Model.CarType;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    public List getAvailableCars(CarType type){

        List cars = new ArrayList();

        if(type.equals(CarType.Mercedes)){
            cars.add("AMG 5.5");
            cars.add(("AMG 6.3"));

        }else if(type.equals(CarType.BMW)){
            cars.add("M5");
            cars.add("M3");

        }else if(type.equals(CarType.Audi)){
            cars.add("RS8");

        }else {
            cars.add("No Car Available");
        }
        return cars;
    }
}
