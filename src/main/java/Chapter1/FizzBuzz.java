package Chapter1;

public class FizzBuzz {

    private static final int FIZZ_NUMBER = 3;
    private static final int BUZZ_NUMBER = 5;
    private static final String FIZZ_TEXT = "Fizz";
    private static final String BUZZ_TEXT = "Buzz";

    public String convert(int number) {

        if(isDivisible(number, FIZZ_NUMBER * BUZZ_NUMBER)) {
            return FIZZ_TEXT + BUZZ_TEXT;
        }
        if(isDivisible(number, FIZZ_NUMBER)){
            return FIZZ_TEXT;
        }
        if(isDivisible(number, BUZZ_NUMBER)) {
            return BUZZ_TEXT;
        }

        return String.valueOf(number);
    }

    private boolean isDivisible(int src, int base) {
        return src % base == 0;
    }

}
