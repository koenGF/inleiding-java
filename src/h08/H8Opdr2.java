package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class H8Opdr2 extends Applet {
    Button Man, Vrouw, PotentielMan, PotentielVrouw;
    int man, vrouw, potentielMan, potentielVrouw, totaal;
    TextField tekstveld;

    public void init() {
        tekstveld = new TextField(50);
        Man = new Button("Man");
        Vrouw = new Button("Vrouw");
        PotentielMan = new Button("Potentiele Man");
        PotentielVrouw = new Button("Potentiele Vrouw");
        Man.addActionListener( new ManListener() );
        Vrouw.addActionListener( new VrouwListener() );
        PotentielMan.addActionListener( new PotentielManListener() );
        PotentielVrouw.addActionListener( new PotentielVrouwListener() );
        add(Man);
        add(Vrouw);
        add(PotentielMan);
        add(PotentielVrouw);
        add(tekstveld);
    }

    public void paint(Graphics g) {
        g.drawString(man + " mannen", 50, 60 );
        g.drawString(vrouw + " vrouwen", 50, 80);
        g.drawString(potentielMan + " potentiele mannelijke studenten",50,100);
        g.drawString(potentielVrouw + " potentiele vrouwelijke studenten",50,120);
        totaal = man + vrouw + potentielMan + potentielVrouw;
        g.drawString(totaal + " totaal", 50, 140);

    }



    class ManListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstveld.getText();
            man += Integer.parseInt(s);
            repaint();
        }
    }
    class VrouwListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstveld.getText();
            vrouw += Integer.parseInt(s);
            repaint();
        }
    }
    class PotentielManListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstveld.getText();
            potentielMan += Integer.parseInt(s);
            repaint();
        }
    }
    class PotentielVrouwListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstveld.getText();
            potentielVrouw += Integer.parseInt(s);
            repaint();
        }
    }
}