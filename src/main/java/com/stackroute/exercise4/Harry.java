package com.stackroute.exercise4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Harry {
    public String findHarry(String string){
        String s1="Is Harry here? true";
        String s2="Is Harry here? false";
        String result="";
        Pattern pattern=Pattern.compile("Harry");            //regex to pattern instance
        Matcher matcher=pattern.matcher(string);              //string to matcher along with pattern
        if(matcher.find()){                                  //if harry is present return true
            result=s1;
        }
        else{
            result=s2;
        }
       return result;
    }
}
