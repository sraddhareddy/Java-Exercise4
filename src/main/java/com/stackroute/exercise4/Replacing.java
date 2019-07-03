package com.stackroute.exercise4;

public class Replacing {              //replace 'd' with 'f' and 'l' with 't'
    public String replace(String string){
       String another=string.replaceAll(Character.toString('d'),Character.toString('f'));
       return another.replaceAll(Character.toString('l'),Character.toString('t'));
    }
}
