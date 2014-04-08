package Chapter1;

import junit.framework.TestCase;

/**
 * Created by mizuki on 2014/04/08.
 */
public class MainTest extends TestCase {

    public MainTest(String name){
        super(name);
    }

    public static void testHasUniqueCharsString() throws Exception{
        Main targetClass = new Main();
        assertTrue(targetClass.hasUniqueChar("a"));
        assertTrue(targetClass.hasUniqueChar("ab"));
        assertTrue(targetClass.hasUniqueChar("abc"));
        assertFalse(targetClass.hasUniqueChar("aa"));
        assertFalse(targetClass.hasUniqueChar("abb"));
        assertFalse(targetClass.hasUniqueChar("aba"));
        assertFalse(targetClass.hasUniqueChar("aab"));
    }
}
