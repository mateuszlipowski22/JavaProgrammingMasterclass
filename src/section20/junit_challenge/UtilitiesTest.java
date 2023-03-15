package section20.junit_challenge;

import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class UtilitiesTest {

    public Utilities utilities;

    @Before
    public void setup(){
        utilities = new Utilities();
    }

    @org.junit.Test
    public void everyNthChar() {
        fail("This test has not been implemented");
    }

    @org.junit.Test
    public void removePairs() {
        assertEquals("ABCDEF", utilities.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", utilities.removePairs("AABCCABDDEEFF"));

    }

    @org.junit.Test
    public void converter() {
        fail("This test has not been implemented");
    }

    @org.junit.Test
    public void nullIfOddLength() {
        fail("This test has not been implemented");
    }
}