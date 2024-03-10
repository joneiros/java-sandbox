package one_file_two_classes;

//Not compilable, but executable. See README for more details.

public class Main {
    public static void main(String[] args) {
        Foober foober = new Foober();

        System.out.println(foober.getFoo());
    }
}

public class Foober {
    public String getFoo(){
        return "foo";
    }
}
