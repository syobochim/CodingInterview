package Chapter1;

/**
 * Created by mizuki on 2014/04/08.
 */
public class Main {

    public boolean hasUniqueChar(String target) {
        char[] charsInString = target.toCharArray();

        for (int i = 0; i < charsInString.length - 1; i++) {
            for (int j = i + 1; j < charsInString.length; j++) {
                if (charsInString[i] == charsInString[j]) return false;
            }
        }
        return true;
    }
}
