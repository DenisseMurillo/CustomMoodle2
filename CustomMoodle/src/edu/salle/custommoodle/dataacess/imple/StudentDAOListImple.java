/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle.dataacess.imple;

import edu.salle.custommoodle.dataacess.StudentDAO;
import edu.salle.custommoodle.model.Studen;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Denisse
 */
public class StudentDAOListImple implements StudentDAO {
    
    public static List<Studen> studentList = new ArrayList();
    
    @Override
    public Studen save(Studen student) {
        String id = Integer.toString(studentList.size()+1);
        student.setId(id);
        studentList.add(student);
        return student;
    }

    @Override
    public List<Studen> findAll() {
        return studentList;
    }

    @Override
    public Studen find(String id) {
        for(Studen student:studentList)
        {
            if(student.getId().equals(id))
            {
                return student;
            }
        }
        return null;
    }
   
    
}
