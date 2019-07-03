package com.stackroute.exercise4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortedOrderTest {
    SortedOrder sortedOrder;
    @Before
    public void setUp(){
        sortedOrder=new SortedOrder();
    }
    @After
    public void tearDown(){
        sortedOrder=null;
    }
    @Test
    public void testSortedOrder(){
        String[] result=sortedOrder.sortingString("hello sraddha thanku and welcome");          //non-repeated words in string
        assertArrayEquals(new String[]{"and","hello","sraddha","thanku","welcome"},result);
    }
    @Test
    public void testSortedOrderOfString(){
        String[] result=sortedOrder.sortingString("hello hello thanku and welcome");              //repeated
        assertArrayEquals(new String[]{"and","hello","hello","thanku","welcome"},result);
    }

    @Test
    public void testSortedOrderOfStringWithSpecialSymbols(){
        String[] result=sortedOrder.sortingString("hello hello$ thanku and welcome");              //repeated
        assertArrayEquals(new String[]{"and","hello","hello$","thanku","welcome"},result);
    }

    @Test
    public void testSortedOrderWithSpecialSymbols(){
        String[] result=sortedOrder.sortingString("$ 456 and");              //numbers and speacial symbols in string
        assertArrayEquals(new String[]{"$","456","and"},result);
    }

    @Test
    public void testSortedOrderOfBlankString(){
        String[] result=sortedOrder.sortingString(" ");              //repeated
        assertArrayEquals(new String[]{},result);
    }

}