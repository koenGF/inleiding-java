package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H8Praktijk extends Applet {
    TextField tekstvak1, tekstvak2;
    Button knopMultiply, knopDivide, knopPlus, knopMinus;
    int getal1, getal2, multiplyIs, divideIs, plusIs, minusIs;
    String multiplyIsString, divideIsString, plusIsString, minusIsString;


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

    class KnopMultiplyListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            getal1 = Integer.parseInt(tekstvak1.getText());
            getal2 = Integer.parseInt(tekstvak2.getText());
            multiplyIs = getal1 * getal2;
            multiplyIsString = Integer.toString(multiplyIs);
            tekstvak1.setText(multiplyIsString);
            tekstvak2.setText("");
            repaint();
        }
    }
    class KnopDivideListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            getal1 = Integer.parseInt(tekstvak1.getText());
            getal2 = Integer.parseInt(tekstvak2.getText());
            divideIs = getal1 / getal2;
            divideIsString = Integer.toString(divideIs);
            tekstvak1.setText(divideIsString);
            tekstvak2.setText("");
            repaint();
        }
    }
    class KnopPlusListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            getal1 = Integer.parseInt(tekstvak1.getText());
            getal2 = Integer.parseInt(tekstvak2.getText());
            plusIs = getal1 + getal2;
            plusIsString = Integer.toString(plusIs);
            tekstvak1.setText(plusIsString);
            tekstvak2.setText("");
            repaint();
        }
    }
    class KnopMinusListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            getal1 = Integer.parseInt(tekstvak1.getText());
            getal2 = Integer.parseInt(tekstvak2.getText());
            minusIs = getal1 - getal2;
            minusIsString = Integer.toString(minusIs);
            tekstvak1.setText(minusIsString);
            tekstvak2.setText("");
            repaint();
        }
    }
}