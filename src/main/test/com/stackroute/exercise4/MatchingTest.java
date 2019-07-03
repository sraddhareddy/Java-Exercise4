package com.stackroute.exercise4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MatchingTest {
    Matching m;
    @Before
    public void setUp(){
        m=new Matching();
    }
    @After
    public void tearDown(){
        m=null;
    }
    @Test
    public void testGivenString(){                           //finding regex in given string
        List<String> result=m.indexMatching("she sells seashells by the seashore","se");
        List<String> h=new ArrayList<>();
        h.add("Found at:4-6");
        h.add("Found at:10-12");
        h.add("Found at:27-29");
        assertEquals(h,result);
    }
    @Test
    public void testGivenUnmatchedString(){                           //finding regex in un matched string
        List<String> result=m.indexMatching("she is a good girl","se");
        List<String> h=new ArrayList<>();
        assertEquals(null,result);
    }
    @Test
    public void testBlankString(){                           //finding regex in blank string
        List<String> result=m.indexMatching(" ","se");
        List<String> h=new ArrayList<>();
        assertEquals(null,result);
    }

    @Test
    public void testingMatchedStrings(){                           //if regex and string are equal
        List<String> result=m.indexMatching("se","se");
        List<String> h=new ArrayList<>();
        h.add("Found at:0-2");
        assertEquals(h,result);
    }

}