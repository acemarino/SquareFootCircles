import java.util.ArrayList;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CircleCreate extends JFrame {

    private static final long serialVersionUID = 1L;

    public CircleCreate(ArrayList<Building>data) {

        setSize(new Dimension(1000,1000));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        JPanel p = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                for(int i= 0; i< data.size();i++){
                    double num=data.get(i).getRadius()*10;

                        Shape circle = new Ellipse2D.Double(num,num,num,num);
                        g2.setPaint(Color.blue);
                        g2.draw(circle);
                }
                
            }
        };
        setTitle("SquareFtCricles");
        this.getContentPane().add(p);
    }
}