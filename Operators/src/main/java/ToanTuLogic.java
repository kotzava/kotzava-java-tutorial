/**
 * Copyright 2021 {@author Quang Truong} (https://kotzava.com).
 * This project is licensed under the MIT license.
 *
 * @since 12/07/2021
 * Github: https://github.com/kotzava
 */

public class ToanTuLogic {
    public static void main(String[] args) {
        int a = 5, b = 3;
        // sử dụng toán tử &&, đúng khi cả 2 cùng đúng
        System.out.println((a>b)&&(a>b)); // true&&true => false
        System.out.println((a>b)&&(a<b)); // true&&false => false
        // sử dụng toán tử ||, điều kiện hoặc, đúng khi 1 trong 2 đúng
        System.out.println((a>b) || (a>b)); // true || true => true
        System.out.println((a>b) || (a<b)); // true || false => true
        // Sử dụng toán tử !, !true = false, !false = true
        System.out.println(!(a==b)); // !false => true
        System.out.println(!(a>b)); // !true => false

    }
}
