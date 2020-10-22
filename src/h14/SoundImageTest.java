package h14;

import java.awt.*;
import java.applet.*;
import java.net.URL;

public class SoundImageTest extends Applet {

    private URL pad;
    private Image afbeelding;
    private AudioClip sound;

    public void init() {
        /* uitgangspunt is dat de package "resources"
                in dezelfde package zit als de java klasse*/
        pad = SoundImageTest.class.getResource("/resources/");
        afbeelding = getImage(pad, "images.jpg");
        sound = getAudioClip(pad, "applaus.wav");
    }

    public void paint(Graphics g) {
        g.drawImage(afbeelding, 20, 20, 400, 300, this);
        sound.play();
    }
}