package com.study.server;

import com.study.models.BodyStyle;
import com.study.models.Car;
import com.study.models.Dealer;

public class MapDemo {
    public static void main(String[] args) {

        Car hondaAccord = Car.newBuilder()
                .setMaker("Honda")
                .setModel("Accord")
                .setYear(2020)
                .setBodyStyle(BodyStyle.COUPE)
                .build();

        Car hondaCivic = Car.newBuilder()
                .setMaker("Honda")
                .setModel("Civic")
                .setYear(2005)
                .setBodyStyle(BodyStyle.SEDAN)
                .build();

        Dealer dealer = Dealer.newBuilder()
                .putModel(2005, hondaCivic)
                .putModel(2020, hondaAccord)
                .build();
        System.out.println(
                // throws IllegalArgumentException if key is not found
                //dealer.getModelOrThrow(2004)

                // returns a default model if key is not found
                // dealer.getModelOrDefault(2019, hondaAccord)

                // returns all elements of the map
                //dealer.getModelMap()

                dealer.getModelOrThrow(2005).getBodyStyle()
        );


    }
}
