package Chapter1;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by mizuki on 2014/04/08.
 */
public class Chapter1_1Test {
    
        @Test
    public void 同一の文字が含まれない場合は真となること() {
        assertThat(Chapter1_1.isUniqueChars("ABCDEFG"), is(true));
    }

    @Test
    public void 同一の文字が含まれる場合は偽となること() {
        assertThat(Chapter1_1.isUniqueChars("ABCDEFGABCDEFG"), is(false));
    }

    @Test
    public void マルチバイトで同一の文字が含まれない場合は真となること() {
        assertThat(Chapter1_1.isUniqueChars("あいうえお"), is(true));
    }

    @Test
    public void マルチバイトで同一の文字が含まれる場合は偽となること() {
        assertThat(Chapter1_1.isUniqueChars("あいうえおかきくけこあ"), is(false));
    }

}
