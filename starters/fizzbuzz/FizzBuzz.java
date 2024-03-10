package fizzbuzz;

public class FizzBuzz {
    public String tryGetFizz(int num) {
        if( num % 3 == 0) {
            return "Fizz";
        }
        return "";
    }

    public String tryGetBuzz(int num) {
        if(num % 5 == 0) {
            return "Buzz";
        }
        return "";
    }
}
