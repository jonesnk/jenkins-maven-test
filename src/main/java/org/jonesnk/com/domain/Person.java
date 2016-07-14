package org.jonesnk.com.domain;

public class Person {

    private String name;
    private Integer age;
    private String occupation;

    public Person(){
        //empty constructor
    }

    public Person(String name, Integer age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

}
