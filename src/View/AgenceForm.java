package View;


import javax.swing.*;
import java.awt.*;

    public class AgenceForm extends JFrame {

        public AgenceForm() {

            setTitle("Formulaire d'agence");
            setSize(500, 400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);

            // Panel principal
            JPanel panel = new JPanel();
            panel.setLayout(null);

            // Titre
            JLabel titre = new JLabel("Formulaire d'agence");
            titre.setBounds(170, 20, 200, 30);
            panel.add(titre);

            // Labels
            JLabel lblId = new JLabel("N° agence :");
            lblId.setBounds(50, 70, 100, 25);
            panel.add(lblId);

            JLabel lblNom = new JLabel("Nom :");
            lblNom.setBounds(50, 110, 100, 25);
            panel.add(lblNom);

            JLabel lblAdresse = new JLabel("Adresse :");
            lblAdresse.setBounds(50, 150, 100, 25);
            panel.add(lblAdresse);

            JLabel lblContact = new JLabel("Contact :");
            lblContact.setBounds(50, 190, 100, 25);
            panel.add(lblContact);

            JLabel lblEmail = new JLabel("Email :");
            lblEmail.setBounds(50, 270, 100, 25);
            panel.add(lblEmail);
            JLabel lblnb_p = new JLabel("nb_p :");
            lblnb_p.setBounds(50, 230, 100, 25);
            panel.add(lblnb_p);


            // Champs de texte
            JTextField txtId = new JTextField();
            txtId.setBounds(160, 70, 200, 25);
            panel.add(txtId);

            JTextField txtNom = new JTextField();
            txtNom.setBounds(160, 110, 200, 25);
            panel.add(txtNom);

            JTextField txtAdresse = new JTextField();
            txtAdresse.setBounds(160, 150, 200, 25);
            panel.add(txtAdresse);

            JTextField txtContact = new JTextField();
            txtContact.setBounds(160, 190, 200, 25);
            panel.add(txtContact);

            JTextField txtEmail = new JTextField();
            txtEmail.setBounds(160, 230, 200, 25);
            panel.add(txtEmail);
            JTextField txtnb_p = new JTextField();
            txtnb_p.setBounds(160, 270, 200, 25);
            panel.add(txtnb_p);


            // Boutons
            JButton btnLire = new JButton("Lire");
            btnLire.setBounds(50, 300, 100, 30);
            panel.add(btnLire);

            JButton btnEnregistrer = new JButton("Enregistrer");
            btnEnregistrer.setBounds(180, 300, 120, 30);
            panel.add(btnEnregistrer);

            JButton btnSupprimer = new JButton("Supprimer");
            btnSupprimer.setBounds(330, 300, 120, 30);
            panel.add(btnSupprimer);

            add(panel);
        }


    }

