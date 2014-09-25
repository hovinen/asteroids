package asteroids;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.*;

public class App {
		public static void main(String args[]) {
			JFrame frame = new JFrame("youwillneverfigurethisout");
			frame.setLayout(new BorderLayout());
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().add(new JField(), BorderLayout.CENTER);
			frame.setTitle("Asteroids");
			frame.pack();
			frame.setVisible(true);
	}
}
