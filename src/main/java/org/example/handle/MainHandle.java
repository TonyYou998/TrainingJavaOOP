package org.example.handle;

import org.example.controller.ClassController;
import org.example.controller.StudentController;
import org.example.controller.TeacherController;

import java.util.Scanner;

public class MainHandle {

    static   Scanner scan=new Scanner(System.in);
    public static void mainProcess() {
        ClassController classController = new ClassController();
        StudentController studentController = new StudentController();
        TeacherController teacherController = new TeacherController();
        while (true) {
            displayMenu();
            System.out.println("Chọn đê:");
            String option = scan.nextLine();
            String className;

            switch (option) {
                case "1":
                    System.out.println("Bạn đã chọn thêm lớp");
                    classController.createClass();
                    break;
                case "2":
                    System.out.println("Bạn đã chọn xóa lớp");
                    System.out.println("Bạn muốn xóa lớp nào");
                    className = scan.nextLine();
                    classController.deleteClass(className);
                    break;
                case "3":
                    System.out.println("Bạn đã chọn tạo 1 sv:");
                    studentController.createStudent();
                    break;
                case "4":
                    System.out.println("Bạn đã chọn xóa sv:");
                    System.out.println("Nhập tên sv muốn xóa");
                    String studentName = scan.nextLine();
                    studentController.removeStudent(studentName);
                    break;
                case "5":
                    System.out.println("Bạn đã chọn thêm sv vào lớp:");
                    System.out.println("Nhập tên lớp");
                    className = scan.nextLine();
                    System.out.println("Nhập tên sin viên");
                    studentName = scan.nextLine();
                    classController.addStudent(className, studentName);
                    break;
                case "6":
                    System.out.println("Bạn đã chọn dk giảng viên");
                    teacherController.createTeacher();
                    break;
                case "7":
                    System.out.println("Bạn đã chọn thêm gv vào lớp");
                    System.out.println("Nhập tên giảng viên");
                    String teacherName = scan.nextLine();
                    System.out.println("Nhập tên lớp");
                    className = scan.nextLine();
                    classController.addTeacher(teacherName, className);
                case "8":
                    System.out.println("Ban đã chọn hiện danh sách tất cả các lớp");
                    classController.display();
                    break;
                case "9":
                    System.out.println("Bạn đã chọn hiện danh sách 1 lớp");
                    System.out.println("Nhập tên lớp");
                    className = scan.nextLine();
                    classController.display(className);
                    break;
                default:
                    return;
            }

        }
    }
    public static void displayMenu(){
        System.out.println("1.Thêm lớp");
        System.out.println("2.Xóa lớp");
        System.out.println("3.Đăng ký sinh viên");
        System.out.println("4.Xóa sinh viên");
        System.out.println("5.Thêm sinh viên vào lớp");
        System.out.println("6.Đăng ký giảng viên");
        System.out.println("7.Thêm giảng viên vào lớp");
        System.out.println("8.Hiện danh sách lớp");
        System.out.println("9.Hiên danh sách sinh viên của 1 lớp");
        System.out.println("-------------------------------------");

    }
}
