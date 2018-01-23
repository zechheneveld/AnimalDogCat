package com.company;

import com.company.Model.*; // * takes anything from the model folder
//import com.company.Model.Cat;
//import com.company.Model.Dog;

public class Main {

    public static void main(String[] args) {

        Cat mufasa = new Cat("Mufasa");
        Dog bear = new Dog("Bear");

        mufasa.speak();
        bear.speak();

    }
}
