package com.stackroute.exercise4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountCharacterTest {
    CountCharacter countCharacter;
    @Before
    public void setUp(){
        countCharacter=new CountCharacter();
    }
    @After
    public void tearDown(){
        countCharacter=null;
    }
    @Test
    public void testCharacterCount(){
        int result=countCharacter.count("sraddha",'d');  //counting occurence of character 'd'
        assertEquals(2,result);
    }
    @Test
    public void testNullCharacterCount(){
        int result=countCharacter.count("sraddha",' ');  //counting null occurence
        assertEquals(0,result);
    }
    @Test
    public void testSpecialCharacterCount(){
        int result=countCharacter.count("sraddha",'$');  //counting occurence of special character
        assertEquals(0,result);
    }
    @Test
    public void testUpperCaseCharacterCount(){
        int result=countCharacter.count("sradDha",'D');  //counting occurence of character capital letter 'D'
        assertEquals(1,result);
    }
    @Test
    public void testCharacterCountInSentence(){
        int result=countCharacter.count("java is java again java again",'a');  //counting occurence of character 'd'
        assertEquals(10,result);
    }
    @Test
    public void testCharacterCountInSameCharacterSequence(){
        int result=countCharacter.count("jjjjj",'j');  //counting occurence of character 'd'
        assertEquals(5,result);
    }

}