package Chapter1;

import org.apache.commons.lang3.ArrayUtils;

import java.nio.CharBuffer;
import java.util.Arrays;

public class Chapter1_4 {

    public static String encodeSpaces(String target) {
        return target.trim().replaceAll("\\s", "%20");
    }

    public static void encodeSpacesUseStringBuffer(StringBuffer target) {
        target.replace(0, target.length(), encodeSpaces(target.toString()));
    }

    public static void encodeSpacesForBooks(char[] target, int length) {
        int spaceCount = 0, newLength, i = 0;
        for (i = 0; i < length; i++) {
            if (target[i] == ' ') {
                spaceCount++;
            }
        }
        newLength = length + spaceCount * 2;
//        target[newLength] = '\0';         // 本には記載があるけど、意味わからない＋実装するとArrayIndexOutOfBoundsException…。
        for (i = length - 1; i >= 0; i--) {
            if (target[i] == ' ') {
                target[newLength - 1] = '0';
                target[newLength - 2] = '2';
                target[newLength - 3] = '%';
                newLength -= 3;
            } else {
                target[newLength - 1] = target[i];
                newLength--;
            }
        }
    }

    public static char[] encodeSpacesUseCharArray(char[] chars, int trueLength) {
        int encodedCharLength = trueLength;
        for (int i = 0; i < trueLength; i++) {
            if (chars[i] == ' ') encodedCharLength += 2;
        }

        CharBuffer charBuffer = CharBuffer.allocate(encodedCharLength);
        for (int i = 0; i < trueLength; i++) {
            if (chars[i] == ' ') {
                charBuffer.append("%20");
            } else {
                charBuffer.append(chars[i]);
            }
        }
        return charBuffer.array();
    }

    public static String encodeSpacesUseRamda(char[] chars, int trueLength) {
        Character[] characters = ArrayUtils.toObject(chars);

        int encodedCharLength = trueLength + ((int) Arrays.asList(characters)
                .stream()
                .filter(s -> s.equals(' '))
                .count() * 2);

        CharBuffer charBuffer = CharBuffer.allocate(encodedCharLength);
        for (int i = 0; i < trueLength; i++) {
            if (chars[i] == ' ') {
                charBuffer.append("%20");
            } else {
                charBuffer.append(chars[i]);
            }
        }
       charBuffer.flip();
        return charBuffer.toString();
    }

}
