package com.example.a3lesson6;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathTest {

    Math math;

    @Before
    public void setUp() {
        math = new Math();
        System.out.println("Before");
    }

    @Test
    public void simpleAddCase() {
        assertEquals("4", math.add("2", "2"));
        System.out.println("simpleAddCase");
    }

    @Test
    public void emptyFieldsCase() {
        assertEquals("Empty Field", math.add("", ""));
        assertEquals("Empty Field", math.div("", ""));
        assertEquals("Empty Field", math.sub("", ""));
        assertEquals("Empty Field", math.mult("", ""));
        System.out.println("emptyFieldsCase");
    }

    @Test
    public void emptyFieldCase() {
        assertEquals("2", math.add("2", ""));
        assertEquals("/ by Zero", math.div("2", ""));
        assertEquals("2", math.sub("2", ""));
        assertEquals("0", math.mult("2", ""));
        System.out.println("emptyFieldCase");
    }

    @Test
    public void withSpacesCase() {
        assertEquals("6", math.add("    2    ", "     4     "));
        assertEquals("2", math.div("    8    ", "     4     "));
        assertEquals("-2", math.sub("    2    ", "     4     "));
        assertEquals("40", math.mult("    10    ", "     4     "));
        System.out.println("addWithSpacesCase");
    }

    @Test
    public void lattersCase() {
        assertEquals("wrong format", math.add("add", "Add"));
        assertEquals("wrong format", math.div("div", "Div"));
        assertEquals("wrong format", math.sub("sub", "Sub"));
        assertEquals("wrong format", math.mult("mult", "Mult"));
        System.out.println("addWithSpacesCase");
    }

    @Test
    public void simpleDivCase() {
        assertEquals("1", math.div("2", "2"));
        System.out.println("simpleDivCase");
    }

    @Test
    public void divByZero() {
        assertEquals("0", math.div("2", "0"));
        System.out.println("divByZero");
    }

    @Test
    public void twoReversedWordsCase() {
        assertEquals("World Hello", math.reverseWords("Hello World"));
        System.out.println("twoReversedWordsCase");
    }

    @Test
    public void threeOrMoreReversedWordsCase() {
        assertEquals("Four Three Two One", math.reverseWords("One Two Three Four"));
        System.out.println("twoReversedWordsCase");
    }

    @Test
    public void spacedReversedWordsCase() {
        assertEquals("Two One", math.reverseWords("    One Two    "));
        System.out.println("twoReversedWordsCase");
    }

    @Test
    public void commaReversedWordsCase() {
        assertEquals("Two One", math.reverseWords("One,Two"));
        System.out.println("twoReversedWordsCase");
    }

    @After
    public void tearDown() {
        math = null;
        System.out.println("After");
    }
}