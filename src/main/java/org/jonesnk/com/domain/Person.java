package org.jonesnk.com.domain;

import java.util.List;

public class Person {

    private String name;
    private Integer age;
    private String occupation;
    private List<String> children;


    public Person(){
        //empty constructor
    }

    public Person(String name, Integer age, String occupation, List<String> children) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.children = children;
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

    public List<String> getChildren() {
        return children;
    }

    public void setChildren(List<String> children) {
        this.children = children;
    }
}
