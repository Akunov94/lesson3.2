package com.company;

public class Main {

    public static void main(String[] args) {
        double[] numbers = {1.2, 1.5, 2.5, -15, 1.8, 11.5, 10, 50.0, 41.2, 25.0, 25.5, -50, 45.5, 17.5, 111.1};
        double summ = 0;
        double kolvo = 0;
        boolean isOtr = false;
        for (double el : numbers) {
            if (el < 0) {
                isOtr = true;
            } else {
                if (isOtr) {
                    summ += el;
                    kolvo++;
                }
            }
        }
        System.out.println(summ / kolvo);//33.910000000000004
    }
}



