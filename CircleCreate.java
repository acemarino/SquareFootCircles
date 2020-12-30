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

    public CircleCreate(ArrayList<Double>data) {

        setSize(new Dimension(320, 320));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        JPanel p = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                for(int i= 0; i< data.size();i++){
                    Shape circle = new Ellipse2D.Double(data.get(i), data.get(i), data.get(i), data.get(i));
                    g2.setPaint(Color.blue);
                    g2.draw(circle);
                }
                
            }
        };
        setTitle("SquareFtCricles");
        this.getContentPane().add(p);
    }
}