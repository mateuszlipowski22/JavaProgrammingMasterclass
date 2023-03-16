package section20.junit_challenge;

import org.junit.Before;

import static org.junit.Assert.*;

public class UtilitiesTest {

    public Utilities utilities;

    @Before
    public void setup(){
        utilities = new Utilities();
    }

    @org.junit.Test
    public void everyNthChar() {
        assertArrayEquals(new char[]{'e', 'l'}, utilities.everyNthChar(new char[]{'h','e','l','l','o'},2));
        assertArrayEquals(new char[]{'h','e','l','l','o'}, utilities.everyNthChar(new char[]{'h','e','l','l','o'},6));

    }

    @org.junit.Test
    public void removePairs() {
        assertEquals("ABCDEF", utilities.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", utilities.removePairs("AABCCABDDEEFF"));
        assertNull("Did not get null returned when argument passed was null", utilities.removePairs(null));
        assertEquals("A", utilities.removePairs("A"));
        assertEquals("", utilities.removePairs(""));
    }

    @org.junit.Test
    public void converter() {
        assertEquals(300, utilities.converter(10,5));
    }

    @org.junit.Test
    public void nullIfOddLength() {
        assertEquals("AABCDDEF", utilities.nullIfOddLength("AABCDDEF"));
        assertEquals(null, utilities.nullIfOddLength("AABCDDEFF"));

    }
}