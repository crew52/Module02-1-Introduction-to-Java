package bt1;

import java.util.Scanner;

public class displayHello {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Hello " + name);
    }
}
