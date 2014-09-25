package asteroids;
import java.awt.BorderLayout;

import javax.swing.*;

public class App {
		public static void main(String args[]) {
			JFrame frame = new JFrame("youwillneverfigurethisout");
			frame.setLayout(new BorderLayout());
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Ship ship = new Ship();
			JField field = new JField(ship);
			frame.getContentPane().add(field, BorderLayout.CENTER);
			frame.setTitle("Asteroids");
			frame.pack();
			frame.setVisible(true);
	}
}
