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
        tekstvak1 = new TextField("type hier iets", 30);
        tekstvak2 = new TextField("type hier iets",30);
        knopMultiply = new Button("*");
        knopMultiply.addActionListener( new KnopMultiplyListener() );
        knopDivide = new Button("/");
        //knopDivide.addActionListener( new KnopDivideListener() );
        knopPlus = new Button("*");
        //knopPlus.addActionListener( new KnopPlusListener() );
        knopMinus = new Button("*");
        //knopMinus.addActionListener( new KnopMinusListener() );
        add(tekstvak1);
        add(tekstvak2);
        add(knopMultiply);
        add(knopDivide);
        add(knopPlus);
        add(knopMinus);
    }

    class KnopMultiplyListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            getal1 = Integer.parseInt(tekstvak1.getText());
            getal2 = Integer.parseInt(tekstvak2.getText());
            repaint();
        }
    }
}