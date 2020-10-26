package h14;

import java.awt.*;
import java.applet.*;
import java.net.URL;
import java.util.*;

public class H14Opdr2 extends Applet {
    private URL path;
    private AudioClip sound;
    String[] speler1,speler2,speler3,speler4;
    String[] deck = {
        "harten aas", "harten 2", "harten 3", "harten 4", "harten 5", "harten 6", "harten 7",
        "harten 8", "harten 9", "harten 10", "harten boer", "harten koningin", "harten koning",

        "ruiten aas", "ruiten 2", "ruiten 3", "ruiten 4", "ruiten 5", "ruiten 6", "ruiten 7",
        "ruiten 8", "ruiten 9", "ruiten 10", "ruiten boer", "ruiten koningin", "ruiten koning",

        "schoppen aas", "schoppen 2", "schoppen 3", "schoppen 4", "schoppen 5", "schoppen 6", "schoppen 7",
        "schoppen 8", "schoppen 9", "schoppen 10", "schoppen boer", "schoppen koningin", "schoppen koning",

        "klaver aas", "klaver 2", "klaver 3", "klaver 4", "klaver 5", "klaver 6", "klaver 7",
        "klaver 8", "klaver 9", "klaver 10", "klaver boer", "klaver koningin", "klaver koning"
};

    public void init() {
        speler1 = new String[13];
        speler2 = new String[13];
        speler3 = new String[13];
        speler4 = new String[13];
        path = H14Opdr2.class.getResource("/resources/");
        sound = getAudioClip(path, "applaus.wav");

        for(int i = 0; i < speler1.length; i++) {
            speler1[i] = deelKaart();
            speler2[i] = deelKaart();
            speler3[i] = deelKaart();
            speler4[i] = deelKaart();
        }
    }

    public void paint(Graphics g) {
        g.drawString("speler1",5,20);
        g.drawString("speler2",155,20);
        g.drawString("speler3",305,20);
        g.drawString("speler4",455,20);
        for (int i = 0,y1 = 50; i < speler1.length; i++,y1 += 20) {
            g.drawString(speler1[i],5,y1);
            g.drawString(speler2[i],155,y1);
            g.drawString(speler3[i],305,y1);
            g.drawString(speler4[i],455,y1);
        }
        sound.play();
    }

    private String deelKaart() {
        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];

        //vervang de inhoud van deck met een nieuwe lijst
        //het nieuwe deck is 1 kaart kleiner dan het oude deck
        String[] hulpLijst = new String[deck.length - 1];
        //om het nieuwe deck te vullen hebben we een index nodig
        int hulpindex = 0;
        //kopieer alle kaarten naar hulplijst behalve de kaart die net gedeeld is
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = deck[i];
                hulpindex++;
            }
        }
        //vervang nu deck met de nieuwe lijst
        deck = hulpLijst;
        //de methode geeft de random kaart terug
        return kaart;
    }
}