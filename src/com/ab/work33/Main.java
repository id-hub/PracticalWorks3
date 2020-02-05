package com.ab.work33;

public class Main {
    public static void main(String[] args) {
        int sum = 1000;
        double percD = 10.0;
        double percU = 7.0;
        double cost = sum - sum * (percD / 100.0); // новая стоимсоть шкафа
        cost += cost * (percU / 100.0); //
        System.out.println("cost = " + cost);
    }
}
