/**
 * Copyright 2021 {@author Quang Truong} (https://kotzava.com).
 * This project is licensed under the MIT license.
 *
 * @since 12/07/2021
 * Github: https://github.com/kotzava
 */

public class ToanTuGan {
    public static void main(String[] args) {
        int page = 5;
        int variable;
        // Gán giá trị cho variable
        variable = page;
        System.out.println("variable = : " + variable); // 5
        // Chuyển nhượng giá trị cũ và giá trị mới
        variable += page; // tương đương với variable = variable + page = 5 + 5 = 10
        System.out.println("variable += : " + variable); // 10
        variable *= page; // variable = variable * page = 50
        System.out.println("variable += : " + variable); // 50
    }
}
