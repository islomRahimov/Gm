package com.company.LIST;

import java.util.ArrayList;
import java.util.Objects;

public class Car implements CarInt {


    String brand;
    String name;
    int year;
    

    public Car() {
    }

    public Car(String brand, String name, int year) {
        this.brand = brand;
        this.name = name;
        this.year = year;
    }
    

    @Override
    public void carList(ArrayList<Car> list) {
        
        for (Car car :list){
            System.out.println(car.brand+" "+car.name+" "+car.year);
            
        }
        System.out.println("==========================");
    }

    @Override
    public void carSearch(String nameSearch, ArrayList<Car> listSearch) {
        boolean isHave = false;
        for (Car car : listSearch){
            
            if (Objects.equals(nameSearch,car.name)){
                isHave = true;
                break;
            }
        }
        if (isHave){
            System.out.println("Yes Car");
        }else {
            System.out.println("No Car");
        }
        System.out.println("+++++++++++++++++++++++++++++++++++");
    }



    
}
