import Entites.*;
import View.AgenceForm;
import View.PersonneForm;

import javax.swing.*;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        Compte C1 = new Compte(13456, 23000000, 123, new Date(), new Date());
        Compte C2 = new Compte(14536, 1430000, 124, new Date(), new Date());
        Compte C3 = new Compte(96574, 234958857, 125, new Date(), new Date());
        Compte C4 = new Compte(12578, 500000000, 127, new Date(), new Date());
        Compte C5 = new Compte(23345, 750000000, 128, new Date(), new Date());

        System.out.println(C1);
        System.out.println(C2);
        System.out.println(C3);
        System.out.println(C4);
        System.out.println(C5);


        CompteSimple CS1 = new CompteSimple(22874, 297233333, 3464, new Date(), new Date());
        CompteSimple CS2 = new CompteSimple(1346, 1567644327, 3546, new Date(), new Date());
        CompteSimple CS3 = new CompteSimple(1232, 1735423, 4356, new Date(), new Date());
        CompteSimple CS4 = new CompteSimple(23368, 123788576, 24322, new Date(), new Date());
        CompteSimple CS5 = new CompteSimple(221794, 329817556, 23789, new Date(), new Date());
        System.out.println(CS1);
        System.out.println(CS2);
        System.out.println(CS3);
        System.out.println(CS4);
        System.out.println(CS5);

        CompteEpargne CE1 = new CompteEpargne(13456, 23000000, 123, new Date(), new Date());
        CompteEpargne CE2 = new CompteEpargne(14536, 1430000, 124, new Date(), new Date());
        CompteEpargne CE3 = new CompteEpargne(96574, 234958857, 125, new Date(), new Date());
        CompteEpargne CE4 = new CompteEpargne(12578, 500000000, 127, new Date(), new Date());
        CompteEpargne CE5 = new CompteEpargne(23345, 750000000, 128, new Date(), new Date());

        System.out.println(CE1);
        System.out.println(CE2);
        System.out.println(CE3);
        System.out.println(CE4);
        System.out.println(CE5);
        ComptePayant CP1 = new ComptePayant(13456, 23000000, 123, new Date(), new Date());
        ComptePayant CP2 = new ComptePayant(14536, 1430000, 124, new Date(), new Date());
        ComptePayant CP3 = new ComptePayant(96574, 234958857, 125, new Date(), new Date());
        ComptePayant CP4 = new ComptePayant(12578, 500000000, 127, new Date(), new Date());
        ComptePayant CP5 = new ComptePayant(23345, 750000000, 128, new Date(), new Date());

        System.out.println(CP1);
        System.out.println(CP2);
        System.out.println(CP3);
        System.out.println(CP4);
        System.out.println(CP5);
        Personne P1= new Personne(3, "fatan", "sogodod", 23, "HALIHS", "67276534", new Date(), new Date(), new Date());
        Personne P2= new Personne(4, "kozoij", "pojso",45, "eezrhjz", "76547655", new Date(), new Date(), new Date() );
        Personne P3= new Personne(5, "JDOUHN", "KJHEUE", 18, "JHGESK", "72846478" , new Date(), new Date(), new Date());
    Personne P4= new Personne(6, "kaojyjye", "ouifiu", 19, "olze", "87426563", new Date(), new Date(), new Date());
    Personne P5 =new Personne(7, "aozdi", "sldhqkj", 25, "hdgjjbj", "778739834", new Date(), new Date(), new Date());
        System.out.println(P1);
        System.out.println(P2);
        System.out.println(P3);
        System.out.println(P4);
        System.out.println(P5);


            SwingUtilities.invokeLater(() -> {
                new PersonneForm().setVisible(true);
            });
            AgenceForm form = new AgenceForm();
            form.setVisible(true);
        }
    }


