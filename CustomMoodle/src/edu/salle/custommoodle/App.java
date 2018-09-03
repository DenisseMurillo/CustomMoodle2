/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle;

import edu.salle.custommoodle.businesslogic.StudentBLO;
import edu.salle.custommoodle.model.Studen;
import edu.salle.custommoodle.view.StudentWindow;
import java.util.List;

/**
 *
 * @author Denisse
 */
public class App {
    public static void main(String[] args) {
//         Studen s1 = new Studen("Alex", "Cornejo");
//         Studen s2 = new Studen("Francisco", "Pérez");
//         Studen s3 = new Studen("Sofía", "Enríquez");
//         Studen s4 = new Studen("Karol", "G");
//         StudentBLO studentBLO = new StudentBLO();
//         studentBLO.save(s1);
//         studentBLO.save(s2);
//         studentBLO.save(s3);
//         studentBLO.save(s4);
//         
//         List<Studen> studenList = studentBLO.findAll();
//         for (Studen student:studenList)
//         {
//             System.out.println(studenList);
//             System.out.println(student);
//             System.out.println("");
//         }
        
        StudentWindow window = new StudentWindow();
        window.setVisible(true);
        
    }
    
}
