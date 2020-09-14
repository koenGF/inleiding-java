package h05;

import java.awt.*;
import java.applet.*;

public class Opdr2 extends Applet {

    //declaratie
    Color valerie;
    Color jeroen;
    Color hans;
    int valerieKG;
    int jeroenKG;
    int hansKG;


    public void init() {
        //initialisatie
        valerie = Color.RED;
        jeroen = Color.BLUE;
        hans = Color.GREEN;
        valerieKG = 40;
        jeroenKG = 100;
        hansKG = 80;

    }




    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);

        //graph
        g.drawLine(50, 50, 50, 530);

        g.drawLine(45, 50, 55, 50);
        g.drawString("120", 20, 55);
        g.drawLine(45, 130, 55, 130);
        g.drawString("100", 20, 135);
        g.drawLine(45, 210, 55, 210);
        g.drawString("80", 20, 215);
        g.drawLine(45, 290, 55, 290);
        g.drawString("60", 20, 295);
        g.drawLine(45, 370, 55, 370);
        g.drawString("40", 20, 375);
        g.drawLine(45, 450, 55, 450);
        g.drawString("20", 20, 455);
        g.drawLine(45, 530, 530, 530);
        g.drawString("0", 20, 535);

        //Valerie
        g.setColor(valerie);
        g.fillRect(160,50+4*(120-valerieKG),20,4*valerieKG);
        g.drawString("Valerie",160,550);

        //Jeroen
        g.setColor(jeroen);
        g.fillRect(280,50+4*(120-jeroenKG),20,4*jeroenKG);
        g.drawString("Jeroen",280,550);

        //Hans
        g.setColor(hans);
        g.fillRect(400,50+4*(120-hansKG),20,4*hansKG);
        g.drawString("Hans",400,550);
    }
}