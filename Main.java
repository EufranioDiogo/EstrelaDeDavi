/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JFrame;
/** 
 *
 * @author ed
 */
public class Main extends JFrame {
    public Main() {
        setSize(400, 300);
        
        add(new Painel());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
    }
}
