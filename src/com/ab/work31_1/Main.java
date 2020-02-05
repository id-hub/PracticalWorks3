package com.ab.work31_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Scanner scanner = new Scanner(System.in);
//        double w = scanner.nextDouble();
//        double gr = w * 453.6;
//        int k = (int) (gr / 1000);
//        int g = (int) (gr - k * 1000);
//        System.out.println("k=" + k + "\ng=" + g);

        System.out.println("Ves v funts ->");
        Scanner scanner = new Scanner(System.in);
        double vesF = scanner.nextDouble();
        double vesGr = vesF * 453.6;
        int kg = (int) (vesGr / 1000);
        double gr = (double) vesGr % 1000;
        System.out.println("Ves (funt) = " + vesF + "\nVes (Kg) = " + kg + "\nVes (g) = " + gr);
    }
}
