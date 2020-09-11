package h04;

import java.awt.*;
import java.applet.*;

public class Praktijk extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);



        //SHAPES ON LEFT
        g.setColor(Color.black);


        //line
        g.drawLine(0,10,200,10);
        g.drawString("Lijn",0,25);

        //rectangle
        g.drawRect(0,30,200,100);
        g.drawString("Rechthoek",0,145);

        //round rectangle
        g.drawRoundRect(0,150,200,100,30,30);
        g.drawString("Afgeronde rechthoek",0,265);



        //SHAPES IN MIDDLE


        //filled rectangle w/ oval
        g.setColor(Color.magenta);
        g.fillRect(210,30,200,100);
        g.setColor(Color.black);
        g.drawOval(210,30,200,100);
        g.drawString("Gevulde rechthoek met ovaal",210,145);

        //filled oval
        g.setColor(Color.magenta);
        g.fillOval(210,150,200,100);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 210,265);



        //SHAPES ON RIGHT


        //filled arc with oval
        g.setColor(Color.magenta);
        g.fillArc(420,30,200,100,0,45);
        g.setColor(Color.black);
        g.drawOval(420,30,200,100);
        g.drawString("Taartpunt met ovaal eromheen",420,145);

        //oval
        g.drawOval(470,150,100,100);
        g.drawString("Cirkel",420,265);
    }
}