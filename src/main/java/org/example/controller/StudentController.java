package org.example.controller;

import org.example.Entites.Student;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentController {

    static int id=1;
    static List<Student> lstStudent=new LinkedList<>();
    public  void createStudent(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Nhập tên");

        Student s=new Student();
        s.setName(scan.nextLine());
        System.out.println("Nhập tuổi");
        s.setAge(Integer.parseInt(scan.nextLine()));
        s.setId(id);
        lstStudent.add(s);
        id++;
    }
    public void  removeStudent(String studentName){

        for(Student s:lstStudent){
            if(s.getName().equals(studentName)){
                lstStudent.remove(s);
                System.out.println("Đã xóa");
                return;
            }
        }
        System.out.println("Không tìm thấy");

    }
}
