package diamond;

public class Main {
    public static void main(String[] args) {
        int dsize = Integer.parseInt(args[0]);
        int paddingSize = dsize - 1;
        int starsNum = 1;

        for(int i=1; i <= (2 * dsize) - 1; i++) {
            String linepad = paddingSize > 0 ? " ".repeat(paddingSize) : "";
            String line = linepad + "*".repeat(starsNum);

            System.out.println(line);

            if ( i < dsize) {
                paddingSize--;
                starsNum +=2;
            }
            else {
                paddingSize++;
                starsNum -=2;
            }
        }
    }
}
