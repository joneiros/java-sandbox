package string_in_string;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Provide a search term, " +
            "followed by a word in which to search (separate with space).");

        String toFind = reader.next();
        String searchSpace = reader.next();

        int matchIndex = searchSpace.indexOf(toFind);

        if(matchIndex == -1 ) {
            System.out.println("No match found");
        }
        else {
            System.out.println("Match found at " + matchIndex + " !");
        }

        reader.close();
    }
}

