package h13;
/*
twee knoppen. 1 knop toont bakstenen, andere beton.
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H13Opdr3 extends Applet {
    Button baksteenKnop,betonKnop;


    public void init() {
        baksteenKnop = new Button("bakstenen");
        betonKnop = new Button("beton");
        baksteenKnop.addActionListener(new BaksteenKnopListener());
        betonKnop.addActionListener(new BetonKnopListener());
        add(baksteenKnop);
        add(betonKnop);
    }

    public void paint(Graphics g) {

    }

    class BaksteenKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }
    class BetonKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }
}