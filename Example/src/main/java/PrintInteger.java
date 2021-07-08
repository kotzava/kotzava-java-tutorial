import java.util.Scanner;
/**
 * Copyright 2021 {@author Quang Truong} (https://kotzava.com).
 * This project is licensed under the MIT license.
 *
 * @since 08/07/2021
 * Github: https://github.com/kotzava
 */

// Chương trình yêu cầu người dùng nhập số từ bàn phím và in ra màn hình
public class PrintInteger {
    public static void main(String[] args) {
        // Tạo một đối tượng sc, để đọc dữ liệu đầu vào từ bàn phím
        Scanner sc = new Scanner(System.in);
        // Hiển thị dòng chữ cho người dùng nhập
        System.out.print("Nhap vao mot so: ");
        // Đọc số được gõ từ bàn phím (nếu nhập chữ sẽ báo lỗi)
        int number = sc.nextInt();
        // Hiển thị giá trị vừa nhập được lưu trong biến number
        System.out.println("So ban vua nhap la: " + number);
    }
}
