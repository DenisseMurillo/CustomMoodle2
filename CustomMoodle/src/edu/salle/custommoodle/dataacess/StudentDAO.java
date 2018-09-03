/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle.dataacess;

import edu.salle.custommoodle.model.Studen;
import java.util.List;

/**
 *
 * @author Denisse
 */
public interface StudentDAO {
    public Studen save(Studen student);
    public List<Studen> findAll();
    public Studen find(String id);
}