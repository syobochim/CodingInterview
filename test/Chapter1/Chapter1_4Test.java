package Chapter1;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by mizuki on 2014/04/13.
 */
public class Chapter1_4Test {

    @Test
    public void 文字列中のスペースをエンコードし末尾のスペースを削除している場合は真となること() {
        assertThat(Chapter1_4.encodeSpaces("Mr John Smith    "), is("Mr%20John%20Smith"));
    }

    @Test
    public void 文字列中のスペースをエンコードし末尾のスペースを削除している場合は真となること_本の答え() {
        char[] target = "Mr John Smith    ".toCharArray();
        char[] expect = "Mr%20John%20Smith".toCharArray();
        Chapter1_4.encodeSpacesForBooks(target, 13);
        assertThat(target, is(expect));
    }
}
