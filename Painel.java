import com.mycompany.bandeiradeisrael.EstrelaDavi;
import javax.swing.JPanel;
import java.awt.geom.AffineTransform;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Polygon;

/**
 *
 * @author ed
 */
public class Painel extends JPanel implements Runnable{
    int[] x = {200, 400, 200, 300};
    int[] y = {200, 200, 400, 200};
    Polygon polygon = new Polygon();
    
    EstrelaDavi estrela = new EstrelaDavi();
    
    int angle = 0;
    int angle1 = 128;
    AffineTransform at;
    Thread thread;
    
    public Painel() {
        thread = new Thread(this);
        thread.start();
    }
    
   @Override
   public void paintComponent(Graphics g) {
       super.paintComponent(g);
       Graphics2D g2d = (Graphics2D) g;
       
       estrela.printEstrela(g2d);
   }
   @Override
   public void run() {
       try {
           while(true) {
               estrela.setAngle(1);
               super.repaint();
               Thread.sleep(20);
           }
       } catch (Exception e) {
           System.out.println("s");
       }
   }
}
