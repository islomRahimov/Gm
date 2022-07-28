package com.company;

import com.company.LIST.Car;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        Car car = new Car();

        ArrayList<Car> carArrayList = new ArrayList<>();

        carArrayList.add(new Car("GM - ", "Lasetti", 22));
        carArrayList.add(new Car("GM - ", "Malibu 2", 2017));
        carArrayList.add(new Car("GM - ", "Spark", 2018));
        carArrayList.add(new Car("GM - ", "Malibu", 2021));


        System.out.println("Car Shop");

        while (true) {
            System.out.println("Car list -> [1] ");
            System.out.println("Car name search -> [2] ");
            System.out.println("Car brand search -> [3] ");
            System.out.print("= ");
            int n = scanner.nextInt();

            switch (n) {
                case 1 -> {
                    car.carList(carArrayList);

                }
                case 2 -> {
                    System.out.println("Search Car");
                    System.out.println("Car name write: ");
                    scanner = new Scanner(System.in);
                    String carName = scanner.nextLine();
                    car.carSearch(carName, carArrayList);

                }
                default -> System.out.println("write error");
            }
        }


    }
}
