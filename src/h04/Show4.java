package h04;

import java.awt.*;
import java.applet.*;

public class Show4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);

        //graph
        g.drawLine(50,10,50,340);
        g.drawLine(45,10,55,10);
        g.drawString("120",20,15);
        g.drawLine(45,65,55,65);
        g.drawString("100",20,70);
        g.drawLine(45,120,55,120);
        g.drawString("80",20,125);
        g.drawLine(45,175,55,175);
        g.drawString("60",20,180);
        g.drawLine(45,230,55,230);
        g.drawString("40",20,235);
        g.drawLine(45,285,55,285);
        g.drawString("20",20,290);
        g.drawLine(45,340,380,340);
        g.drawString("0",20,345);

        //Valerie
        g.setColor(Color.red);
        g.fillRect(122,230,20,110);
        g.drawString("Valerie",122,365);

        //Jeroen
        g.setColor(Color.blue);
        g.fillRect(205,65,20,275);
        g.drawString("Jeroen",205,365);

        //Hans
        g.setColor(Color.green);
        g.fillRect(288,120,20,220);
        g.drawString("Hans",288,365);

    }
}