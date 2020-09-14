package h06;

import java.awt.*;
import java.applet.*;

public class H6Praktijk extends Applet{
    double grade1;
    double grade2;
    double grade3;
    double gemiddelde;
    int gemiddeldeInt;
    double gemiddeldeDouble;

    public void init() {
        grade1 = 5.9;
        grade2 = 6.3;
        grade3 = 6.9;
        gemiddelde = (grade1 + grade2 + grade3) / 3  * 10;
        gemiddeldeInt = (int) gemiddelde;
        gemiddeldeDouble = (double) gemiddeldeInt / 10;

    }
    public void paint(Graphics g) {
        setBackground(Color.orange);
        g.setColor(Color.black);

        g.drawString("Het gemiddelde is: " + gemiddeldeDouble + ".",20,20);


    }
}
