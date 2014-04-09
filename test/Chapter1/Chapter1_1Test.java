package Chapter1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by mizuki on 2014/04/08.
 */
public class Chapter1_1Test {

    @Test
    public void 文字列に含まれる文字がすべて一意であるか() throws Exception{
        assertTrue(Chapter1_1.isUniqueChars("ab"));
        assertTrue(Chapter1_1.isUniqueChars("abc"));
        assertFalse(Chapter1_1.isUniqueChars("aa"));
        assertFalse(Chapter1_1.isUniqueChars("abb"));
        assertFalse(Chapter1_1.isUniqueChars("aba"));
        assertFalse(Chapter1_1.isUniqueChars("qwertyuiopasdfghjklzxcvbnmq"));
    }

}
