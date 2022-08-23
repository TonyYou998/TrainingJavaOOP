package org.example.controller;

import org.example.Entites.Class;
import org.example.Entites.Student;
import org.example.Entites.Teacher;
import org.example.service.ClassService;
import org.example.service.ClassServiceImpl;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public  class ClassController {
    public static List<Class> lstClass=new LinkedList<>();
    private ClassService classService;
    public ClassController(){
        this.classService=new ClassServiceImpl();

    }
    public  void createClass(){

        Scanner scan=new Scanner(System.in);
        System.out.println("Nhập tên lớp");
        String className= scan.nextLine();
        System.out.println("Nhập số sv");
        int members= Integer.parseInt(scan.nextLine());

        classService.createClass(className,members);


    }
    public void deleteClass(String className){
        for (Class item:lstClass){
            if(item.getName().equals(className)){
                lstClass.remove(item);
                System.out.println("đã xóa");
                break;
            }

        }
        System.out.println("Không tìm thấy lớp");


    }
    public  void display(){
        if(lstClass.isEmpty()){
            System.out.println("Không có lớp");
            return;
        }

       for(Class item:lstClass){
           System.out.println(item.toString());
       }

    }
    public  void display(String className){
        Class c=null;
        for (Class item:lstClass){
            if(item.getName().equals(className)){
                c=item;
                break;
            }
        }
        if(c!=null){
            for(Student item:c.getLstStudent()){
                System.out.printf("Lớp:%s Giảng viên:%s slot:%s",c.getName(),c.getTeacher().getName(),c.getMembers());
                System.out.println(item.toString());
            }
        }

    }
    public  void addStudent(String className, String studentName) {
            Class c=null;
            Student s=null;
            for(Class item:lstClass){
                if(item.getName().equals(className)){
                    c=item;
                    break;
                }



            }
            for(Student item:StudentController.lstStudent){
                if(item.getName().equals(studentName)){
                  s=item;
                  break;
                }



            }
            if(c!=null && s!=null)
                c.setLstStudent(s);
            else {
                System.out.println("Sinh viên hoặc lớp không tồn tại");
            }


    }

    public  void addTeacher(String teacherName, String className) {
        Teacher t=null;
        Class c=null;
            for(Teacher item:TeacherController.lstTeacher){
                if(item.getName().equals(teacherName)){
                    t=item;
                    break;
                }
            }
            for(Class item:lstClass){
                if(item.getName().equals(className)){
                    c=item;
                    break;
                }
            }
            if(c!=null &&t!=null){
                c.setTeacher(t);
            }
            else {
                System.out.println("Lớp hoặc giảng viên không tồn tại");
            }

    }
}
