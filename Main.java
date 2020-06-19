interface Algebra{
    void draw();
}

public class Main {
    public static void main(String[] args) {
        int width = 10;

        Algebra d2= () -> {
            System.out.println("width : "+ width);
        };
        d2.draw();
    }
}