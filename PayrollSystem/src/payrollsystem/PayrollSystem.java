/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollsystem;

/**
 *
 * @author Admin
 */

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import payrollsystem.entity.eUser;

public class PayrollSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("PayrollSystemPU");
        EntityManager entitymanager = emfactory.createEntityManager();
        
        eUserJpaController jpacontroller = new eUserJpaController(emfactory);
        eUser eUserObj = new eUser();
        
        eUserObj.setAge(22);
        eUserObj.setName("Sanjeewa");
        eUserObj.setSalary(22000);
        
        jpacontroller.create(eUserObj);
        
    }
    
}

