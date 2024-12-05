package th3;

import java.util.Scanner;

public class OperatorExpression {
    public static void main(String[] args) {
        float width, height;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width: ");
        width = sc.nextFloat();
        System.out.println("Enter the height: ");
        height = sc.nextFloat();
        float area = width * height;

        System.out.println("Area is: " + area);
    }
}
