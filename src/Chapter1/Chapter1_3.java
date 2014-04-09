package Chapter1;

import java.util.Arrays;

/**
 * Created by mizuki on 2014/04/10.
 */
public class Chapter1_3 {

    public static boolean isSameChars(String str1, String str2) {
        char[] chr1 = str1.toCharArray();
        char[] chr2 = str2.toCharArray();

        Arrays.sort(chr1);
        Arrays.sort(chr2);

        return Arrays.equals(chr1, chr2);
    }
}
