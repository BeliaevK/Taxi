package ru.GoldTaxi.Entities;

import java.util.ArrayList;

/**
 * Created by Scala on 30.10.2016.
 */
public class CarSearch {
            public static void searchFreeCar(ArrayList<Car> carArrayList, Order order) {
                Car reservedCar = null;
                for (Car car : carArrayList) {
                    if (CarSearch.compareOrderToCar(car, order)) {
                        reservedCar = car;
                        reservedCar.setCarStatus(Car.getTypeOfStatusReserved());
                        order.setCarReserver(reservedCar);
                        break;
                    }
                }
                if (reservedCar != null) {
                    System.out.println("На ваш заказ назначена: "+reservedCar);
                } else {
                    System.out.println("В данный момент нет подходящего для вас автомобиля, заявка ожидает подходящего, освободившегося автомобиля.");
                }


            }

            private static boolean compareOrderToCar(Car car, Order order) {
                boolean isSuitCar = true;
                if (Car.getTypeOfStatusReserved().equals(car.getCarStatus())) return false;
                if (!(car.isBabySeat() == order.isNeedBabySeat())) isSuitCar = false;
                if (!(car.isSmoking() == order.isNeedSmoking())) isSuitCar = false;
                if (!(car.getCarClass() == order.getNeedCarClass())) isSuitCar = false;
                return isSuitCar;
            }
}
