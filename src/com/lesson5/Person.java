package com.lesson5;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String fullName, position, eMail, phoneNumber;
    private float salary;
    private int age;
    private int personId;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public Person(String fullName, String position, String phoneNumber, float salary, int age ){
        personId=this.hashCode();
        this.fullName=fullName;
        this.position=position;
        this.eMail=eMail;
        this.phoneNumber=phoneNumber;
        this.salary=salary;
        this.age=age;
        this.eMail= createEMail(fullName);
    }

    private String createEMail(String fullName){
        String[] names= fullName.toLowerCase().split(" ");
        if(names.length==1) return names[0]+"@example.com";
        else
        return names[1].charAt(0)+"."+names[0]+"@example.com";



    }

    @Override
    public String toString() {
        return  "Fullname='" + fullName + '\'' +
                ", Position='" + position + '\'' +
                ", e-mail='" + eMail + '\'' +
                ", Phone number=" + phoneNumber + '\'' +
                ", Salary=" + salary +
                ", Age=" + age +
                '}';
    }
    public void outPersonToConsole(){
        System.out.println(toString());
    }

}
