package h14;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H14Praktijk extends Applet {
    int aantalDonuts = 23;
    String computerTurn = "";
    TextField tekstvak;
    Label label;
    Button knop;

    public void init() {
        label = new Label("1, 2 of 3 donuts?");
        tekstvak = new TextField ("", 12);
        knop = new Button ("reset");
        tekstvak.addActionListener(new TekstvakListener());
        knop.addActionListener(new KnopListener());
        add(label);
        add(tekstvak);
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString("er zijn " + aantalDonuts + " donuts.",5,50);
        g.drawString(computerTurn,5,70);
//teken donuts
        for (int i = 0, x = 10, y = 75; i < aantalDonuts; i++, x+=65) {
            if (i % 6 == 0 && i != 0) {
                y+=65;
                x = 10;
            }
            tekenDonut(g, x, y);
        }
    }


    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            int donutsTaken;

//check getal
            try {
                donutsTaken = Integer.parseInt(s);
            } catch (Exception f){
                donutsTaken = 4;
            }
            if (donutsTaken >= 1 && donutsTaken <= 3) {
                aantalDonuts = aantalDonuts - donutsTaken;
    //verliezer
                if(aantalDonuts <= 0) {
                    tekstvak.setText("je hebt verloren!");
                    computerTurn = "";
                }
    //computer turn
                if(aantalDonuts > 0) {
                    int reserveDonut = aantalDonuts;

        //winnende computer
                    for (int i = 1; i <= 3; i++) {
                        int testDonut = aantalDonuts - i;
                        if ((testDonut - 1) % 4 == 0 || testDonut == 1) {
                            aantalDonuts -= i;
                            computerTurn = "de computer heeft " + i + " donut(s) genomen.";
                        }
                    }

        //verliezende computer
                    if (reserveDonut == aantalDonuts) {
                        double r = Math.random();
                        int worp = (int) (r * 3 + 1);
                        aantalDonuts -= worp;
                        computerTurn = "de computer heeft " + worp + " donut(s) genomen.";
                    }
        //winnaar
                    if(aantalDonuts <= 0) {
                        tekstvak.setText("je hebt gewonnen!");
                        computerTurn = "";
                    }
                }
            repaint();
            }


//fout getal
            else {
                tekstvak.setText("verkeerde invoer (getal 1-3)");
            }
        }
    }


//resetknop
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        aantalDonuts = 23;
        tekstvak.setText("");
        computerTurn = "";
        repaint();
        }
    }

//tekenDonut
    public void tekenDonut( Graphics g,int x, int y) {
        g.setColor(Color.pink);
        g.fillOval(x,y,60,60);
        g.setColor(Color.white);
        g.fillOval(x+20,y+20,20,20);
        g.setColor(Color.blue);
        g.drawLine(x+30,y+50,x+35,y+47);
        g.drawLine(x+40,y+10,x+43,y+11);
        g.drawLine(x+10,y+30,x+12,y+33);
        g.drawLine(x+45,y+32,x+48,y+35);
        g.drawLine(x+15,y+17,x+18,y+13);
    }
}