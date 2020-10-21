package h13;
/*
beetje lelijke code. zonder de if in paint gaat hij direct tekenen omdat tekenMuur met while true draait.
En met width = 0 houdt hij nooit op, dus breekt het.
*/
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H13Opdr3 extends Applet {
    Button baksteenKnop,betonKnop;
    int a=0,b=0,width=0,height=0;


    public void init() {
        baksteenKnop = new Button("bakstenen");
        betonKnop = new Button("beton");
        baksteenKnop.addActionListener(new BaksteenListener());
        betonKnop.addActionListener(new BetonKnopListener());
        add(baksteenKnop);
        add(betonKnop);
    }

    public void paint(Graphics g) {
        if(width > 0) {
            tekenMuur(g,0,0,a,b,width,height);
        }
    }

    class BaksteenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            setBackground(Color.red);
            width = 100;
            height = 40;
            a = width/2;
            b = height;
        }
    }

    class BetonKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            setBackground(Color.darkGray);
            width = 80;
            height = 60;
            a = width/2;
            b= height;
        }
    }


    public void tekenMuur( Graphics g, int posX1, int posY1, int posX2, int posY2, int x, int y) {
        while(true) {
            g.drawRect(posX1,posY1,x,y);
            posY1 += y * 2;
            if(posY1 >= 600) {
                posX1 += x;
                posY1 = 0;
                if(posX1 >= 600) break;
            }
        }
        while(true) {
            g.drawRect(posX2, posY2, x, y);
            posY2 += y * 2;
            if (posY2 >= 600) {
                posX2 += x;
                posY2 = y;
                if (posX2 >= 600) break;
            }
        }
    }
}