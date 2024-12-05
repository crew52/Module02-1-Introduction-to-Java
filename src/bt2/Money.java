package bt2;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        final int RATE = 23000;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Usd: ");
        double usd = in.nextDouble();
        System.out.printf(usd + " USD is " + (RATE * usd) + " VND" );
    }
}
