package bt3;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number (10-20): ");
        int num = in.nextInt();

        switch (num) {
            case 10:
                System.out.println("ten");
                break;
            case 11:
                System.out.println("eleven");
                break;
            case 12:
                System.out.println("twelve");
                break;
            case 13:
                System.out.println("thirteen");
                break;
            case 14:
                System.out.println("fourteen");
                break;
            case 15:
                System.out.println("fifteen");
                break;
            case 16:
                System.out.println("sixteen");
                break;
            case 17:
                System.out.println("seventeen");
                break;
            case 18:
                System.out.println("eighteen");
                break;
            case 19:
                System.out.println("nineteen");
                break;
            default:
                System.out.println("..");
        }
    }
}
