package com.stackroute.exercise4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTest {
    Reverse reverse;
    @Before
    public void setUp(){
        reverse=new Reverse();
    }
    @After
    public void tearDown(){
        reverse=null;
    }
    @Test
    public void testString(){
        String result=reverse.reverseString("sraddha hi how are you");
        assertEquals("ahddars ih woh era uoy",result);           //words in sentence should reverse
    }
    @Test
    public void testSingleWordString(){
        String result=reverse.reverseString("sraddha");                  //single word
        assertEquals("ahddars",result);
    }

    @Test
    public void testSpace(){
        String result=reverse.reverseString("");                  //single space
        assertEquals("",result);
    }

    @Test
    public void testSpacesString(){
        String result=reverse.reverseString("   ");                  //since we are splitting at space we get no string
        assertEquals("",result);
    }

}