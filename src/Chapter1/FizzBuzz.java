package Chapter1;

public class FizzBuzz {
    public String convert(int number) {

        if(isDivisible(number, 3 * 5)) {
            return "FizzBuzz";
        }
        if(isDivisible(number, 3)){
            return "Fizz";
        }
        if(isDivisible(number, 5)) {
            return "Buzz";
        }

        return String.valueOf(number);
    }

    private boolean isDivisible(int src, int base) {
        return src % base == 0;
    }

}
