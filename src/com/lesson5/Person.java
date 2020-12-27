package com.lesson5;

public class Person {
    private static int id;
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

    public float getSalary() {
        return salary;
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

    Person(String fullName, String position, String phoneNumber, float salary, int age ){
        personId=id++;
        this.fullName=fullName;
        this.position=position;
        this.eMail=eMail;
        this.phoneNumber=phoneNumber;
        this.salary=salary;
        this.age=age;
        this.eMail= createEMail(fullName);
    }

    private String createEMail(String fullName){
        String surname = "";
        for (int i = 0; i < fullName.indexOf(' '); i++) {
            surname=surname+fullName.charAt(i);
        }
        return fullName.toLowerCase().charAt(fullName.indexOf(' ')+1)+"."+surname.toLowerCase()+"@example.com";

    }

    @Override
    public String toString() {
        return "Сотрудник{" +
                "ФИО='" + fullName + '\'' +
                ", Должность='" + position + '\'' +
                ", e-mail='" + eMail + '\'' +
                ", Номер телефона='" + phoneNumber + '\'' +
                ", Заработная плата=" + salary +
                ", Возраст=" + age +
                '}';
    }
    public void outPersonToConsole(){
        System.out.println(toString());
    }
}
