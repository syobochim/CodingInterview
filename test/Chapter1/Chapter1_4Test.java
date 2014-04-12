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

}
