package com.stackroute.exercise4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HarryTest {
Harry harry;
@Before
    public void setUp(){
    harry=new Harry();
}
@After
    public void tearDown(){
    harry=null;
}
@Test
    public void testString(){
    String result=harry.findHarry("Harry is a bad boy");      //harry is present
    assertEquals("Is Harry here? true",result);
}
    @Test
    public void testAnotherString(){
        String result=harry.findHarry("Good day");      //harry is present
        assertEquals("Is Harry here? false",result);
    }
    @Test
    public void testBlankString(){
        String result=harry.findHarry(" ");      //blank space as string
        assertEquals("Is Harry here? false",result);
    }
    @Test
    public void testStringAnother(){
        String result=harry.findHarry("");
        assertEquals("Is Harry here? false",result);
    }
}