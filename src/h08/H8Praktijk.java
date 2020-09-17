package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H8Praktijk extends Applet {
    TextField tekstvak1;
    TextField tekstvak2;
    Button knopMultiply;
    Button knopDivide;
    Button knopPlus;
    Button knopMinus;
    int getal1;
    int getal2;
    int multiplyIs;
    int divideIs;
    int plusIs;
    int minusIs;

    public void init() {
        tekstvak1 = new TextField("getal 1", 10);
        tekstvak2 = new TextField("getal 2",10);
        knopMultiply = new Button("*");
        knopMultiply.addActionListener( new KnopMultiplyListener() );
        knopDivide = new Button("/");
        knopDivide.addActionListener( new KnopDivideListener() );
        knopPlus = new Button("+");
        knopPlus.addActionListener( new KnopPlusListener() );
        knopMinus = new Button("-");
        knopMinus.addActionListener( new KnopMinusListener() );
        add(tekstvak1);
        add(tekstvak2);
        add(knopMultiply);
        add(knopDivide);
        add(knopPlus);
        add(knopMinus);
    }


    //klaar als ik weet hoe een int in een tekstvak komt.

    class KnopMultiplyListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            getal1 = Integer.parseInt(tekstvak1.getText());
            getal2 = Integer.parseInt(tekstvak2.getText());
            multiplyIs = getal1 * getal2;
            tekstvak1.setText("");
            tekstvak2.setText("");
            repaint();
        }
    }
    class KnopDivideListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            getal1 = Integer.parseInt(tekstvak1.getText());
            getal2 = Integer.parseInt(tekstvak2.getText());
            divideIs = getal1 / getal2;
            tekstvak1.setText("");
            tekstvak2.setText("");
            repaint();
        }
    }
    class KnopPlusListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            getal1 = Integer.parseInt(tekstvak1.getText());
            getal2 = Integer.parseInt(tekstvak2.getText());
            plusIs = getal1 + getal2;
            tekstvak1.setText("");
            tekstvak2.setText("");
            repaint();
        }
    }
    class KnopMinusListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            getal1 = Integer.parseInt(tekstvak1.getText());
            getal2 = Integer.parseInt(tekstvak2.getText());
            minusIs = getal1 - getal2;
            tekstvak1.setText("");
            tekstvak2.setText("");
            repaint();
        }
    }
}