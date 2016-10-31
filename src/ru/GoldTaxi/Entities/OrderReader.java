package ru.GoldTaxi.Entities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Scala on 31.10.2016.
 */
public class OrderReader {
    public static Order orderRead() throws IOException {
        Order order = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] sSplit = s.split("\\|");
        order = new Order(sSplit[0],sSplit[1],Boolean.parseBoolean(sSplit[2]),Boolean.parseBoolean(sSplit[3]),Integer.parseInt(sSplit[3]));
        String startPoint = sSplit[0];
        String endPoint = sSplit[1];
        boolean babySeat = Boolean.parseBoolean(sSplit[2]);
        boolean smoking = Boolean.parseBoolean(sSplit[3]);
        int carClass = Integer.parseInt(sSplit[3]);

        System.out.println(order);
        return order;
    }
}
