package custom;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class customPanel extends JPanel {
    @Override
    public void paint(Graphics g){
        Image image = new ImageIcon(getClass().getResource("/custom/a.jpg")).getImage();
        g.drawImage(image, 0, 0, getWidth(),getHeight(),this);
        setOpaque(false);
        super.paint(g);
    }
    
}