package Chapter1;

/**
 * Created by mizuki on 2014/04/13.
 */
public class Chapter1_5 {
    public static String compressString(String target) {
        char[] targetChars = target.toCharArray();
        StringBuilder resultStringBuilder = new StringBuilder();

        for (int i = 0; i < targetChars.length; i++) {
            int sameCharCounter = 1;
            for (int j = i + 1; j < target.length(); j++) {
                if (targetChars[i] != targetChars[j]) break;
                sameCharCounter++;
                i = j;
            }
            resultStringBuilder.append(targetChars[i]);
            resultStringBuilder.append(sameCharCounter);
        }

        if (resultStringBuilder.length() >= target.length()) {
            return target;
        }
        return resultStringBuilder.toString();
    }
}
