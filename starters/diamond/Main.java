package diamond;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final int dsize = Integer.parseInt(args[0]);
        int paddingSize = dsize - 1;
        int starsNum = 1;
        ArrayList<String> linesToPrint = new ArrayList<String>();

        for(int i=1; i <= (2 * dsize) - 1; i++) {
            String linepad = paddingSize > 0 ? " ".repeat(paddingSize) : "";
            String line = linepad + "*".repeat(starsNum);

            //System.out.println(line);
            linesToPrint.add(line);

            if ( i < dsize) {
                paddingSize--;
                starsNum +=2;
            }
            else {
                paddingSize++;
                starsNum -=2;
            }
        }

        for(String printable : linesToPrint ) {
            System.out.println(printable);
        }
    }
}
