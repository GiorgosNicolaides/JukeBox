package java2assignment.GUI;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class PlayButton extends JButton {

    ImageIcon img = new ImageIcon(getClass().getResource("play.png"));

    public PlayButton() {
        this.setBounds(210, 250, 50, 50);
        this.setIcon(new javax.swing.ImageIcon(getClass().getResource("play.png")));

    }
}
