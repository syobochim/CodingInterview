package Chapter1;

/**
 * Created by mizuki on 2014/04/13.
 */
public class Chapter1_5 {
    public static String compressString(String target) {
        StringBuilder resultStringBuilder = new StringBuilder();

        for (int i = 0; i < target.length(); i++) {
            int sameCharCounter = 1;
            while (i < target.length() - 1 && target.charAt(i) == target.charAt(i + 1)) {
                sameCharCounter++;
                i++;
            }
            resultStringBuilder.append(target.charAt(i));
            resultStringBuilder.append(sameCharCounter);
        }

        if (resultStringBuilder.length() >= target.length()) {
            return target;
        }
        return resultStringBuilder.toString();
    }
}
