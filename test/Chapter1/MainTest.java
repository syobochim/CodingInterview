package Chapter1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by mizuki on 2014/04/08.
 */
public class MainTest {

    @Test
    public void 文字列に含まれる文字がすべて一意であるか() throws Exception{
        assertTrue(Main.isUniqueChars("ab"));
        assertTrue(Main.isUniqueChars("abc"));
        assertFalse(Main.isUniqueChars("aa"));
        assertFalse(Main.isUniqueChars("abb"));
        assertFalse(Main.isUniqueChars("aba"));
        assertFalse(Main.isUniqueChars("qwertyuiopasdfghjklzxcvbnmq"));
    }

}
