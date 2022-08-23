package org.example.repository;

import org.example.Entites.Class;

import java.util.LinkedList;
import java.util.List;

public class ClassRepositoryImpl implements ClassRepository {
    private static List<Class> lstClass=new LinkedList<>();
    @Override
    public void addClassToList(Class c) {
        lstClass.add(c);
    }
}
