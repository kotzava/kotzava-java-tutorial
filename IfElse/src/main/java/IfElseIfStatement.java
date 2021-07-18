/**
 * Copyright 2021 {@author Quang Truong} (https://kotzava.com).
 * This project is licensed under the MIT license.
 *
 * @since 18/07/2021
 * Github: https://github.com/kotzava
 */

public class IfElseIfStatement {
    public static void main(String[] args) {
        int a = 6;
        int b = 6;
        if(a > b){
            System.out.println("A > B");
        }else if (a < b){
            System.out.println("A < B");
        }else {
            System.out.println("A = B");
        }
    }
}
