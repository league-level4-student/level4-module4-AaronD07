package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;  
    static ArrayList<Polymorph> morphs = new ArrayList<Polymorph>();
    static BluePolymorph blue1 = new BluePolymorph(10, 10); 
    static RedMorph red1 = new RedMorph(10, 50);
    static MovingMorph moving1 = new MovingMorph(10, 100);
    static CircleMorph circle1 = new CircleMorph(100, 100);
   
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
   	 morphs.add(blue1);
     morphs.add(red1);
     morphs.add(moving1);
     morphs.add(circle1);
     	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
   
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	 for(int i=0; i<morphs.size(); i++) {
   		 morphs.get(i).draw(g);
   	 }
   	 //draw polymorph
   	
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      
      		 morphs.get(2).update(moving1);
      		 morphs.get(3).update2(circle1);
   	 repaint();
   	 
    }
}
