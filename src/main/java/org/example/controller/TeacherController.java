package org.example.controller;

import org.example.Entites.Teacher;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TeacherController {
    public static Scanner scan=new Scanner(System.in);
    public static int id=1;
    public static List<Teacher> lstTeacher=new LinkedList<>();
    public void createTeacher() {
        System.out.println("Nhập tên giảng viên");
        Teacher t=new Teacher();
        t.setName(scan.nextLine());
        System.out.println("Nhập tuỏi");
        t.setAge(Integer.parseInt(scan.nextLine()));
        t.setId(id);
        lstTeacher.add(t);
        id++;
    }

}
