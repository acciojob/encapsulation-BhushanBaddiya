package com.driver;

public class RWOnly {
    //As we know name is private in class RWOnly so it doesnt excess out side
    //the class it only excess inside the class only so giving error
    //
    private String name;
//    RWOnly(String name ){
//        this.name = name;
//    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

}
