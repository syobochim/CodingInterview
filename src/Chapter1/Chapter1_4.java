package Chapter1;

/**
 * Created by mizuki on 2014/04/13.
 */
public class Chapter1_4 {

    public static String encodeSpaces(String target) {
        return target.replaceAll("\\s+$", "").replaceAll("\\s", "%20");
    }
}
