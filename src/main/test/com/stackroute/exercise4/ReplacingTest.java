package com.stackroute.exercise4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class ReplacingTest {
    Replacing replacing;
    @Before
    public void setUp(){
        replacing = new Replacing();
    }
    @After
    public void tearDown(){
        replacing=null;
    }
    @Test
    public void testStringWithD(){
        String result=replacing.replace("sraddha");
        assertEquals("sraffha",result);          //normal test case
    }

    @Test
    public void testStringWithoutDAndL(){
        String result=replacing.replace("java question");
        assertEquals("java question",result);          //without any replacing charcaters
    }

    @Test
    public void testStringWithAllDAndL(){
        String result=replacing.replace("ddddllll");
        assertEquals("fffftttt",result);          //string with replacing characters
    }

    @Test
    public void testStringWithNoCharcaters(){
        String result=replacing.replace("");
        assertEquals("",result);          //No character
    }

    @Test
    public void testString(){
        String result=replacing.replace("sraddha");
        assertNotEquals("srfffha",result);          //using assertNotEquals
    }



}