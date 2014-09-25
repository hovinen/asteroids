package asteroids;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class App {
		public static void main(String args[]) {
			JFrame frame = new JFrame("youwillneverfigurethisout");
			frame.setLayout(new BorderLayout());
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			final Ship ship = new Ship();
			final Universe universe = new Universe();
			final KeyEventProcessor keyEventProcessor = new KeyEventProcessor(ship);
			final JField field = new JField(ship, universe);
			field.addKeyListener(new KeyAdapter() {

				@Override
				public void keyPressed(KeyEvent e) {
					switch (e.getKeyCode()) {
					case KeyEvent.VK_UP:
						keyEventProcessor.upPressed();
						break;
					case KeyEvent.VK_DOWN:
						keyEventProcessor.downPressed();
						break;
					case KeyEvent.VK_LEFT:
						keyEventProcessor.leftPressed();
						break;
					case KeyEvent.VK_RIGHT:
						keyEventProcessor.rightPressed();
						break;
					case KeyEvent.VK_SPACE:
						keyEventProcessor.spacePressed();
						break;

					default:
						break;
					}
				}
				
			});
			final MainThread mainThread = new MainThread(new TickReceiver() {
				
				@Override
				public void tick() {
					SwingUtilities.invokeLater(new Runnable() {
						@Override
						public void run() {
							universe.tick();
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
			field.addComponentListener(new ComponentAdapter() {

				@Override
				public void componentShown(ComponentEvent e) {
					final Component component = e.getComponent();
					component.requestFocusInWindow();
					component.removeComponentListener(this);
				}
				
			});
			frame.setVisible(true);
	}
}
