package org.example.Entites;

import java.util.Scanner;

public class Teacher extends User{

    @Override
    public void createUser() {
        Scanner scan=new Scanner(System.in);
        String name=scan.nextLine();
        System.out.println("Nhập Tên");

    }
}
