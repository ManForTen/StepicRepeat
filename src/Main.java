import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class Main {
    static JFrame frame = new JFrame();
    static int size=50;// Размер текстуры

    public static class AddTexture {
        public JLabel l;
        public AddTexture(BufferedImage im, int i, int j) {
            l = new JLabel(new ImageIcon(im));
            l.setBounds(i*size, j*size, size, size);
            frame.add(l);
        }
    }
    public static void main(String[] args) throws IOException {
        int width=800, height=600;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Текстура");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds(dim.width / 2 - width / 2, dim.height / 2 - height / 2, width, height);
        BufferedImage im = ImageIO.read(new URL("https://i.pinimg.com/originals/e1/17/f3/e117f3d7ddab4337c6b5e3f00fd1bbde.jpg")).getSubimage(0,0,size,size);
        for (int i = 0; i <= width/size; i++)
            for (int j = 0; j <= height/size; j++)
                new AddTexture(im,i,j);
        frame.setVisible(true);
    }
}