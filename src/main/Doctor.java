package main;

import java.util.HashMap;

public class Doctor{

    private String name;
    private String title;
    private int age;
    private HashMap<String, String> personnelData;


    public Doctor(String name, String title, int age){
        this.name = name;
        this.age = age;
        this.title = title;
    }


    private String getName(){
        return this.name;
    }

    private void setName(String newName){
        this.name = newName;
    }


}