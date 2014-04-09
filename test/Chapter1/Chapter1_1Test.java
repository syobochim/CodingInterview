package Chapter1;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by mizuki on 2014/04/08.
 */
public class Chapter1_1Test {

    @Test
    public void 文字列に含まれる文字がすべて一意であるか() throws Exception{
        assertThat(true, is(Chapter1_1.isUniqueChars("ab")));
        assertThat(true, is(Chapter1_1.isUniqueChars("abc")));
        assertThat(false, is(Chapter1_1.isUniqueChars("aa")));
        assertThat(false, is(Chapter1_1.isUniqueChars("abb")));
        assertThat(false, is(Chapter1_1.isUniqueChars("aba")));
        assertThat(false, is(Chapter1_1.isUniqueChars("qwertyuiopasdfghjklzxcvbnmq")));
    }

}
