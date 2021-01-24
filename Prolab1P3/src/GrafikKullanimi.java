
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GrafikKullanimi extends JPanel {
//private Robot robot;

    private int[][] array;
    private int engel_sayisi = 0;
    public int x = 650;
    public int y = 650;
    public int x2 = x;
    public int y2 = y;

    public GrafikKullanimi(int[][] array, int engel_sayisi) {

        setBackground(Color.blue);
        //this.robot=robot;
        this.array = array;
        this.engel_sayisi = engel_sayisi;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.

        g.setColor(Color.red);
        for (int i = 0; i < engel_sayisi; i++) {
            g.fillRect((array[i][0] - 1) * 30, (array[i][1] - 1) * 30, 30, 30);

        }

        g.setColor(Color.orange);
        g.fillOval(x, y, 30, 30);

        g.setColor(Color.green);
        g.drawLine(x + 15, y + 15, x2 + 15, y2 + 15);

        g.setColor(Color.yellow);

        int cizgi = 0;
        for (int i = 0; i < 21; i++) {
            g.drawLine(0 + cizgi, 0, 0 + cizgi, 600);
            g.drawLine(0, 0 + cizgi, 600, 0 + cizgi);
            cizgi = cizgi + 30;
        }

        /*g.setColor(Color.red);
        for (int i = 0; i < engel_sayisi; i++) {
                 g.fillRect((array[i][0]-1)*30,(array[i][1]-1)*30 , 30,30);   
                    
            
        }*/
        //g.fillOval((i-1)*30+10,(i-1)*30+10 , 30,30);
    }

}
