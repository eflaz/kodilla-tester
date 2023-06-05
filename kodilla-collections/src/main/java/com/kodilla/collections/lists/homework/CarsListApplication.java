package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Fiat fiat = new Fiat(60);
        cars.add(fiat);
//        cars.add(new Fiat(50));
        cars.add(new Ford(40));
        cars.add(new Opel(30));

        cars.remove(1);
        cars.remove(fiat);

        System.out.println(cars.size());
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

    }
}
