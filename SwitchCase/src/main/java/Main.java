/**
 * Copyright 2021 {@author Quang Truong} (https://kotzava.com).
 * This project is licensed under the MIT license.
 *
 * @since 31/10/2021
 * Github: https://github.com/kotzava
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.next());
        switch (number) {
            case 1:
                System.out.println("Number = 1");
                break;
            case 2:
                System.out.println("Number = 2");
                break;
            case 3:
                System.out.println("Number = 3");
                break;
            case 4:
                System.out.println("Number = 4");
                break;
            case 5:
                System.out.println("Number = 5");
                break;
            default:
                System.out.println("Number = " + number);
        }
    }
}