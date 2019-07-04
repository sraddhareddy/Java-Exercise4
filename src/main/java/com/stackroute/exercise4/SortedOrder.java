package com.stackroute.exercise4;

import java.util.Arrays;

public class SortedOrder {
    public String[] sortingString(String string){
        String[] array=string.split(" ");       //sorting by using .sort() method in Arrays class
        Arrays.sort(array);
        return array;
    }
}
