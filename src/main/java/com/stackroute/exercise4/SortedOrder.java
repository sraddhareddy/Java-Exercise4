package com.stackroute.exercise4;

import java.util.Arrays;

public class SortedOrder {
    public String[] sortingString(String string){
        String[] array=string.split(" ");       //sorting
        Arrays.sort(array);
        return array;
    }
}
