package org.example.Entites;

import java.util.Scanner;

public class Student extends User {
     static int id=1;
     @Override
     public String toString(){
          return "ID:"+getId() +" Name:"+getName()+" age:"+getAge();
     }


}
