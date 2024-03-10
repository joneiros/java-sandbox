package fizzbuzz;

public class Main {
    public static void main(String[] args) {
        int num = Integer.valueOf(args[0]);
        FizzBuzz fb = new FizzBuzz();

        for( int i = 1; i <= num ; i++) {
            // String foo = tryGetFizz(i) + tryGetBuzz(i);
            String foo = fb.tryGetFizz(i) + fb.tryGetBuzz(i);
            String toPrint = "".equals(foo) ? String.valueOf(i) : foo;
            System.out.println(toPrint);
        }
    }
}
