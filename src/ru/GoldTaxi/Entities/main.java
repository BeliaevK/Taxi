package ru.GoldTaxi.Entities;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Scala on 31.10.2016.
 */
public class main {
    public static void main(String[] args) throws IOException {
        ArrayList<Car> carArrayList = Initialization.initCarArray();
        while (true) {
            Order order = OrderReader.orderRead();
            CarSearch.searchFreeCar(carArrayList, order);
        }
    }
}
