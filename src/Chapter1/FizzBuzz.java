package Chapter1;

public class FizzBuzz {
    public String convert(int src) {

        if(multiply(src, 3 * 5)) {
            return "FizzBuzz";
        }
        if(multiply(src, 3)){
            return "Fizz";
        }
        if(multiply(src, 5)) {
            return "Buzz";
        }

        return String.valueOf(src);
    }

    private boolean multiply(int src, int base) {
        return src % base == 0;
    }

}
