package Chapter1;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by mizuki on 2014/04/10.
 */
public class Chapter1_3Test {

    @Test
    public void 二つの文字列の構成要素が同じであるか(){
        assertThat(true, is(Chapter1_3.isSameChars("abc", "cba")));
        assertThat(true, is(Chapter1_3.isSameChars("abc", "abc")));
        assertThat(false, is(Chapter1_3.isSameChars("abc", "cdba")));
        assertThat(false, is(Chapter1_3.isSameChars("abc", "def")));
    }

}
