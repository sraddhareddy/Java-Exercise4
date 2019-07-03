package com.stackroute.exercise4;

public class CountCharacter {
    public int count(String string,char ch){
        String another=string.replaceAll(Character.toString(ch),"");   //replacing given character with space
        int count=string.length()-another.length();   //difference between 2 strings will be the count
        return count;
    }
}
