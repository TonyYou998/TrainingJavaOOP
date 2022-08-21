package org.example.Entites;

import java.util.LinkedList;
import java.util.List;

public class Class extends BaseEntity {

    private int members;
    private Teacher teacher;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setLstStudent(List<Student> lstStudent) {
        this.lstStudent = lstStudent;
    }

    private List<Student> lstStudent=new LinkedList<>();

    public List<Student> getLstStudent() {
        return lstStudent;
    }

    public void setLstStudent(Student s) {
        this.lstStudent.add(s);
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }
    @Override
    public String toString(){
        return   "Name: "+getName()+" member "+getMembers();

    }



}
