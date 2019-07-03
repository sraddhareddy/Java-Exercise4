package com.stackroute.exercise4;

public class Reverse {                    //each word in a sentence should reverse
public String reverseString(String string){
    String[] arr=string.split(" ");
    String returning="";
    for(int j=0;j<arr.length;j++){
        String one=reversing(arr[j]);
          returning=returning + one + " ";      //calling another method
    }
    return returning.trim();
}
public String reversing(String action){
    String[] array=action.split("");               //reversing each string individually
    String result="";
    for(int i=array.length-1;i>=0;i--){
        result=result+array[i];
    }
    return result;
}
}
