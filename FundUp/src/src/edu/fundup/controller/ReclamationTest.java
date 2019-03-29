package src.edu.fundup.controller;

import edu.fundup.service.IReclamationService;
import edu.fundup.entity.Reclamation;

public class ReclamationTest {

    public static void main(String[] args) {
        Reclamation reclamation = new Reclamation();
        reclamation.setId(1571);
        reclamation.setIduser(1);
        reclamation.setIdobjet(6);
        reclamation.setDescription("TestFromJAVA");
        reclamation.setRaison("ReclamationTest");
        reclamation.setTypeobjet("Test");

         IReclamationService reclamationDAO = new IReclamationService();
        System.out.println("----------");
        reclamationDAO.addReclamation(reclamation);
        System.out.println("*****************");

    }
}
