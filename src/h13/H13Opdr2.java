package h13;
/*
teken een muur van rode baksteen.
rode achtergrond, zwarte rectangles.
weet niet zeker of dit is hoe ik het had moeten doen, maar het werkt.
 */
import java.awt.*;
import java.applet.*;

public class H13Opdr2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        tekenBakstenen(g,0,0,50,40,100,40);
    }

    public void tekenBakstenen( Graphics g, int posX1, int posY1, int posX2, int posY2, int x, int y) {
        setBackground(Color.red);
        while(true) {
            g.drawRect(posX1,posY1,x,y);
            posY1 += 80;
            if(posY1 >= 600) {
                posX1 += 100;
                posY1 = 0;
                if(posX1 >= 600) break;
            }
        }
        while(true) {
            g.drawRect(posX2, posY2, x, y);
            posY2 += 80;
            if (posY2 >= 600) {
                posX2 += 100;
                posY2 = 40;
                if (posX2 >= 600) break;
            }
        }
    }
}