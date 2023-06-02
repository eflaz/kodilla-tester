package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {

   private static final Random RANDOM = new Random();

   public static void main(String[] args) {
      Car[] cars = new Car[RANDOM.nextInt(15) + 1];
      for (int n = 0; n < cars.length; n++)
         cars[n] = drawCar();
      for (Car car : cars)
         CarUtils.describeCar(car);
   }


   public static Car drawCar() {
      int drawnTypeCar = RANDOM.nextInt(3);
      int speed = getRandomSpeed();

      if (drawnTypeCar == 0)
         return new Fiat(speed);
      else if (drawnTypeCar == 1)
         return new Opel(speed);
      else {
         return new Ford(speed);

      }
   }

   private static int getRandomSpeed() {
      return RANDOM.nextInt(100);
   }
}
