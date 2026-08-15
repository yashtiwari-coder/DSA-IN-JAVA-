
import javax.swing.*;
import java.awt.*;

    public class IndianFlag {

        public static void main(String[] args) {

            JFrame frame = new JFrame("Indian National Flag");
            frame.setSize(800, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel() {
                public void paintComponent(Graphics g) {
                    super.paintComponent(g);

                    // Saffron
                    g.setColor(new Color(255, 153, 51));
                    g.fillRect(100, 100, 600, 100);

                    // White
                    g.setColor(Color.WHITE);
                    g.fillRect(100, 200, 600, 100);

                    // Green
                    g.setColor(new Color(19, 136, 8));
                    g.fillRect(100, 300, 600, 100);

                    // Ashoka Chakra
                    g.setColor(new Color(0, 0, 128));
                    g.drawOval(340, 210, 80, 80);

                    // 24 spokes
                    for (int i = 0; i < 24; i++) {
                        double angle = i * Math.PI / 12;

                        int x1 = 380;
                        int y1 = 250;

                        int x2 = 380 + (int)(40 * Math.cos(angle));
                        int y2 = 250 + (int)(40 * Math.sin(angle));

                        g.drawLine(x1, y1, x2, y2);
                    }

                    // Flag pole
                    g.setColor(Color.BLACK);
                    g.fillRect(80, 80, 20, 500);

                    // Base
                    g.fillRect(40, 580, 100, 20);
                }
            };

            frame.add(panel);
            frame.setVisible(true);
        }
    }


