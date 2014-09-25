package asteroids;
import java.awt.BorderLayout;

import javax.swing.*;

public class App {
		public static void main(String args[]) {
			JFrame frame = new JFrame("youwillneverfigurethisout");
			frame.setLayout(new BorderLayout());
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			final Ship ship = new Ship();
			final JField field = new JField(ship);
			final MainThread mainThread = new MainThread(new TickReceiver() {
				
				@Override
				public void tick() {
					SwingUtilities.invokeLater(new Runnable() {
						@Override
						public void run() {
							ship.tick();
							field.tick();
						}
					});
				}
			});
			mainThread.start();
			frame.getContentPane().add(field, BorderLayout.CENTER);
			frame.setTitle("Asteroids");
			frame.pack();
			frame.setVisible(true);
	}
}
