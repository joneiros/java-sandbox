package self.fizzbuzz;

public class fizzbuzz {
    public static void main(String[] args) {
        int num = Integer.valueOf(args[0]);

        for( int i = 1; i <= num ; i++) {
            String foo = tryGetFizz(i) + tryGetBuzz(i);
            String toPrint = "".equals(foo) ? String.valueOf(i) : foo;
            System.out.println(toPrint);
        }
    }

    private static String tryGetFizz(int num) {
        if( num % 3 == 0) {
            return "Fizz";
        }
        return "";
    }

    private static String tryGetBuzz(int num) {
        if(num % 5 == 0) {
            return "Buzz";
        }
        return "";

    }
}
