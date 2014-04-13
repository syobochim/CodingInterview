package Chapter1;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by mizuki on 2014/04/13.
 */
public class Chapter1_5Test {

//    テストを削除
//    @Test
//    public void 全ての文字が異なる文字列について文字の数を文字の後につけていること(){
//        assertThat(Chapter1_5.compressString("abc"), is("a1b1c1"));
//    }

    @Test
    public void 全ての文字が同じ文字列について文字の後に文字数をつけていること() {
        assertThat(Chapter1_5.compressString("aaa"), is("a3"));
    }

    @Test
    public void 文字が混在している文字列について文字の後に文字数をつけている場合は真となること() {
        assertThat(Chapter1_5.compressString("aabcccccaaa"), is("a2b1c5a3"));
    }

    @Test
    public void 圧縮後の文字列が圧縮前よりも長い場合は元の文字列を返すこと() {
        assertThat(Chapter1_5.compressString("aab"), is("aab"));
    }

}
