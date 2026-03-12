package main;

import java.util.HashMap;

public class Personnel{

    private String name;
    private String title;
    private int age;
    private String employeeId;
    private HashMap<String, String> personnelData;


    public Personnel(String name,  String title, int age){
        this.name = name;
        this.age = age;
        this.title = title;
    }


    protected String getName(){
        return this.name;
    }

    protected void setName(String newName){
        this.name = newName;
    }


}