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
    public void 文字列中のスペースをエンコードし末尾のスペースを削除している場合は真となること_StringBuffer版() {
        StringBuffer target = new StringBuffer("Mr John Smith    ");
        Chapter1_4.encodeSpacesUseStringBuffer(target);
        assertThat(target.toString(), is("Mr%20John%20Smith"));
    }

    @Test
    public void 文字列中のスペースをエンコードし末尾のスペースを削除している場合は真となること_本の答え() {
        // Stringだと値を変更することができないから、char[] を使う
        char[] target = "Mr John Smith    ".toCharArray();
        char[] expect = "Mr%20John%20Smith".toCharArray();
        Chapter1_4.encodeSpacesForBooks(target, 13);
        assertThat(target, is(expect));
    }
}
