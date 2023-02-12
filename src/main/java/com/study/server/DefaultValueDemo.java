package com.study.server;

import com.study.models.Person;

public class DefaultValueDemo {
    public static void main(String[] args) {
        Person person = Person.newBuilder().build();

        System.out.println("City: " + person.getAddress().getCity()); // string default is ""
        System.out.println(person.hasAddress());    // boolean default is false
        System.out.println(person.getAge());  // int32 default is 0
    }
}
