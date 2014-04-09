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

    public static boolean isSameCharsForBook(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] letters = new int[256]; //文字コードASCⅡの場合

        char[] str1_array = str1.toCharArray();
        for (char c : str1_array) {
            letters[c]++;
        }

        for (int i = 0; i < str2.length(); i++) {
            int c = (int) str2.charAt(i);
            if (--letters[c] < 0) {
                return false;
            }
        }

        return true;
    }
}
