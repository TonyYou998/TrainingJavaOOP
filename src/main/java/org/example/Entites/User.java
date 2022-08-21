package org.example.Entites;

import java.util.Scanner;

public abstract class User extends BaseEntity {

    private  static int id=0;
    private int age;
    public  void createUser(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Nhập tên");
        String name=scan.nextLine();
        super.setName(name);
        System.out.println("nhập tuổi");
        int age=Integer.parseInt(scan.nextLine());
        this.age=age;
//        this trỏ đến instance của class hiện tại
//        static thuộc về class ko thuộc về instance
        super.setId(id);
        id++;
    }






    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
