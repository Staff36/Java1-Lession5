package com.lesson5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Person [] personArray= new Person[5];
        getArrayPerson(personArray);
        getPersonWhoOlderByValue(personArray);
    }

    private static void getArrayPerson(Person[] personArray){

        personArray[0]= new Person("Ivanov Invan","Sales manager","+79000000001",30000f, 25);
        personArray[1]= new Person("Petrov Petr","CEO","+79000000001",80000f,42);
        personArray[2]= new Person("Sezhakova Bella","Cleaning manager","+79666666661",2500.3f,39);
        personArray[3]= new Person("Sidorov Sidor", "accountant","+79000000023", 25000.3f,41);
        personArray[4]= new Person("Putin Vladimir", "Security officer","+79990001001",200000.99f,60);

    }

    private static void getPersonWhoOlderByValue(Person[] personArray){
        System.out.println("Введите возраст:");
        Scanner scanner= new Scanner(System.in);
        int value =scanner.nextInt();
        System.out.println("Будут показаны сотрудники старше "+value);
        for (int i = 0; i <personArray.length ; i++) {
            if (personArray[i].getAge()>value) personArray[i].outPersonToConsole();
        }
    }
}
