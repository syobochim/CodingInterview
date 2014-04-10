package Chapter1;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by mizuki on 2014/04/10.
 */
public class Chapter1_3Test {

    @Test
    public void 二つの文字列の構成要素が同じ場合は真となること() {
        assertThat(Chapter1_3.isSameChars("abc", "cba"), is(true));
    }

    @Test
    public void 二つの文字列の構成要素が異なる場合は偽となること() {
        assertThat(Chapter1_3.isSameChars("abc", "def"), is(false));
    }

    @Test
    public void 大文字と小文字が異なる場合は偽となること() {
        assertThat(Chapter1_3.isSameChars("abC", "abc"), is(false));
    }

    @Test
    public void マルチバイトの二つの文字列の構成要素が同じ場合は真となること() {
        assertThat(Chapter1_3.isSameChars("あいう", "うあい"), is(true));
    }

    @Test
    public void マルチバイトの二つの文字列の構成要素が異なる場合は偽となること() {
        assertThat(Chapter1_3.isSameChars("あいう", "うあお"), is(false));
    }

    @Test
    public void 二つの文字列の構成要素が同じ場合は真となること_本のアルゴリズム() {
        assertThat(Chapter1_3.isSameCharsForBook("abc", "cba"), is(true));
    }

    @Test
    public void 二つの文字列の構成要素が異なる場合は偽となること_本のアルゴリズム() {
        assertThat(Chapter1_3.isSameCharsForBook("abc", "def"), is(false));
    }

    @Test
    public void 大文字と小文字が異なる場合は偽となること_本のアルゴリズム() {
        assertThat(Chapter1_3.isSameCharsForBook("abC", "abc"), is(false));
    }

/*
    ASCⅡを想定しているため、マルチバイトのテストは実施しない
    @Test
    public void マルチバイトの二つの文字列の構成要素が同じ場合は真となること_本のアルゴリズム() {
        assertThat(Chapter1_3.isSameCharsForBook("あいう", "うあい"), is(true));
    }
*/

/*
    ASCⅡを想定しているため、マルチバイトのテストは実施しない
    @Test
    public void マルチバイトの二つの文字列の構成要素が異なる場合は偽となること_本のアルゴリズム() {
        assertThat(Chapter1_3.isSameCharsForBook("あいう", "うあお"), is(true));
    }
*/

}
