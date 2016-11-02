package ru.GoldTaxi.Entities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by Scala on 31.10.2016.
 */
public class OrderReader {

    private static BufferedReader instance;

    public static synchronized BufferedReader getReader() {
        if (instance == null) {
            instance = new BufferedReader(new InputStreamReader(System.in));
        }
        return instance;
    }

    public static Order orderRead() throws IOException {
        Order order = null;
        boolean isCorrectOrder = false;
        while (!isCorrectOrder) {
            String s = getReader().readLine();
            String[] sSplit = s.split("\\|");
            if (checkOrderFieldsIsCorrect(sSplit)) {
                if (sSplit.length == 2) {
                    order = new Order(sSplit[0], sSplit[1], false, false, 0);
                } /*else if (sSplit.length == 3) {
            order = new Order(sSplit[0],sSplit[1],Boolean.parseBoolean(sSplit[2]));
            } else if (sSplit.length == 4) {
            order = new Order(sSplit[0],sSplit[1],Boolean.parseBoolean(sSplit[2]),Boolean.parseBoolean(sSplit[3]));*//*
            }*/ else
                try {
                    if (sSplit.length == 5)
                        order = new Order(sSplit[0], sSplit[1], Boolean.parseBoolean(sSplit[2]), Boolean.parseBoolean(sSplit[3]),
                                Integer.parseInt(sSplit[4]));
                }catch (NumberFormatException e){
                    System.out.println("Неверный формат заявки. Пример: \n 1) Начальная улица|Конечная улица " +
                            "\n 2) Начальная улица|Конечная улица|0|0|0");
                }
                } else {
                    System.out.println("Неверный формат заявки. Пример: \n 1) Начальная улица|Конечная улица " +
                            "\n 2) Начальная улица|Конечная улица|0|0|0");
                }
            if (order != null) isCorrectOrder = true;
        }
        return order;
    }
    private static boolean checkOrderFieldsIsCorrect(String[] sSplit) {
        boolean isCorrect = true;
        if (sSplit.length < 1) isCorrect = false;
        if (sSplit.length == 3) isCorrect = false;
        if (sSplit.length == 4) isCorrect = false;
        try {
            if (sSplit[0].length() == 0) isCorrect = false;
            if (sSplit[1].length() == 0) isCorrect = false;
        } catch (NumberFormatException e) {
            isCorrect = false;
        } catch (ArrayIndexOutOfBoundsException e) {
            isCorrect = false;
        }
        return isCorrect;
    }

}

