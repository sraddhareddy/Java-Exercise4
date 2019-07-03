package com.stackroute.exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matching {
    public List<String> indexMatching(String string, String expression) {
        String s = "";
        Pattern pattern = Pattern.compile(expression);               //taking give string into instance of pattern
        Matcher m = pattern.matcher(string);                         //match regex with text using matcher class
        List<String> list = new ArrayList<String>();
            while (m.find()) {
                s = "Found at:" + m.start() + "-" + m.end();         //returning index
                list.add(s);
            }
            m=m.reset();
            if(m.find()) {
                return list;
            }

            else{
                return null;
            }

    }
}
