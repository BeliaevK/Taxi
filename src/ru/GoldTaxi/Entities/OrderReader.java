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
        if (sSplit.length == 2){
            order = new Order(sSplit[0],sSplit[1]);
        } else
        if (sSplit.length == 3){
            order = new Order(sSplit[0],sSplit[1],Boolean.parseBoolean(sSplit[2]));
        } else
        if (sSplit.length == 4){
            order = new Order(sSplit[0],sSplit[1],Boolean.parseBoolean(sSplit[2]),Boolean.parseBoolean(sSplit[3]));
        } else
        if (sSplit.length == 5){
        order = new Order(sSplit[0],sSplit[1],Boolean.parseBoolean(sSplit[2]),Boolean.parseBoolean(sSplit[3]),
                Integer.parseInt(sSplit[4]));
        }



       // System.out.println(order);
        return order;
    }
}
