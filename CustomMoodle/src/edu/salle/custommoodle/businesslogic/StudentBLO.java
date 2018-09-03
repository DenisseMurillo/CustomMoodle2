/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle.businesslogic;

import edu.salle.custommoodle.dataacess.StudentDAO;
import edu.salle.custommoodle.dataacess.imple.StudentDAOListImple;
import edu.salle.custommoodle.dataacess.imple.StudentDAOMySQL;
import edu.salle.custommoodle.model.Studen;
import java.util.List;

/**
 *
 * @author Denisse
 */
public class StudentBLO {
    private StudentDAO studentDAO;
    public StudentBLO()
    {
        studentDAO = new StudentDAOListImple();
    }
    public Studen save(Studen studen)
    {
        return studentDAO.save(studen);
    }
    public List<Studen> findAll()
    {
        return studentDAO.findAll();
    }
    
    public Studen find(String id)
    {
        return studentDAO.find(id);
    }
    
      
}
