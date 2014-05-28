package Chapter1;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {
    FizzBuzz sut;

    @Before
    public void setup() {
        sut = new FizzBuzz();
    }

    @Test
    public void _1を入力したら1を返すべき() {
        assertThat(sut.convert(1), is("1"));
    }

    @Test
    public void _2を入力したら2を返すべき() {
        assertThat(sut.convert(2) , is("2"));
    }

    @Test
    public void _3を入力したらFizzを返すべき() {
        assertThat(sut.convert(3), is("Fizz"));
    }

    @Test
    public void _6を入力したらFizzを返すべき() {
        assertThat(sut.convert(6), is("Fizz"));
    }

    @Test
    public void _5を入力したらBuzzを返すべき() {
        assertThat(sut.convert(5), is("Buzz"));
    }

    @Test
    public void _15を入力したらFizzBuzzを返すべき() {
        assertThat(sut.convert(15), is("FizzBuzz"));
    }

}
