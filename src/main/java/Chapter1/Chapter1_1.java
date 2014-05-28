package Chapter1;

public class Chapter1_1 {

    public static boolean isUniqueChars(String target) {
/*
        char[] charsInString = target.toCharArray();
        for (int i = 0; i < charsInString.length - 1; i++) {
            for (int j = i + 1; j < charsInString.length; j++) {
                if (charsInString[i] == charsInString[j]){
                    return false;
                }
            }
        }
        return true;
*/
/*
        boolean[] char_set = new boolean[256];
        for(int i = 0;i < target.length(); i++){
            int val = target.charAt(i);
            if(char_set[val]){
                return false;
            }
            char_set[val] = true;
        }
        return true;
*/
/*
        char[] charsInString = target.toCharArray();
        for (int i = 0; i < target.length(); i++) {
            if (i != target.indexOf(charsInString[i])) {
                return false;
            }
        }
        return true;
*/
        return target.chars().distinct().count() == target.length();
    }
}
