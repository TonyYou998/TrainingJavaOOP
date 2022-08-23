package org.example.service;

import org.example.Entites.Class;
import org.example.repository.ClassRepository;
import org.example.repository.ClassRepositoryImpl;

public class ClassServiceImpl implements ClassService {
    private ClassRepository repository;
    public ClassServiceImpl(){
        this.repository=new ClassRepositoryImpl();

    }
    @Override
    public void createClass(String className, int members) {
        Class c=new Class();
        c.setName(className);
        c.setMembers(members);
        repository.addClassToList(c);
    }
}
