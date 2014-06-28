package Chapter1;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Chapter1_6Test {

    int[][] target;

    @Before
    public void setUp() throws Exception {
        // Setup
        target = new int[][]{{11, 12, 13}, {21, 22, 23}, {31, 32, 33}};
    }

    @Test
    public void 大きさが3x3の画像を入力したとき変換後の画像サイズが3x3になること() throws Exception {
        int[][] actual = Chapter1_6.turnImage(target, 3);
        assertThat(actual.length, is(3));
        assertThat(actual[0].length, is(3));
        assertThat(actual[1].length, is(3));
        assertThat(actual[2].length, is(3));
    }

    /**
     * 11 12 13      31 21 11
     * 21 22 23  ->  32 22 12
     * 31 32 33      33 23 13
     * @throws Exception
     */
    @Test
    public void 行列の中身が90度右に回転されていること() throws Exception {
        int[][] actual = Chapter1_6.turnImage(target, 3);
        assertThat(actual[0], is(new int[]{31, 21, 11}));
        assertThat(actual[1], is(new int[]{32, 22, 12}));
        assertThat(actual[2], is(new int[]{33, 23, 13}));
    }
}
