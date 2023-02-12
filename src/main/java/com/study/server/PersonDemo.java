package com.study.server;

import com.google.protobuf.Int32Value;
import com.study.models.Address;
import com.study.models.Car;
import com.study.models.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonDemo {
    public static void main(String[] args) {


        Address address = Address.newBuilder()
                        .setPostbox(123)
                        .setStreet("main street")
                        .setCity("Atlanta")
                        .build();

        Car hondaAccord = Car.newBuilder()
                        .setMaker("Honda")
                        .setModel("Accord")
                        .setYear(2020)
                        .build();

        Car hondaCivic = Car.newBuilder()
                .setMaker("Honda")
                .setModel("Civic")
                .setYear(2005)
                .build();

        List<Car> cars = new ArrayList<>();
        cars.add(hondaAccord);
        cars.add(hondaCivic);

        Person sam = Person.newBuilder()
                .setName("sam")
                .setAge(Int32Value.newBuilder().setValue(25).build())
                .setAddress(address)
                //.addCar(hondaAccord)
                //.addCar(hondaCivic)        this way will work too
                .addAllCar(cars)
                .build();

        System.out.println(sam.toString());
    }
}
