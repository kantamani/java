//Creating a window

import java.awt.*;
import javax.swing.*;

public class Window {
	private static void createWindow() {
		JFrame jf=new JFrame("I will be sincere to my work");
		
		JLabel textLabel=new JLabel("I am successful.I have an high paying salary",SwingConstants.CENTER);
		textLabel.setPreferredSize(new Dimension(300,300));
		jf.getContentPane().add(textLabel, BorderLayout.CENTER);
		
		jf.setLocationRelativeTo(null);
		jf.pack();
		jf.setVisible(true);
		}
		public static void main(String[] args) {
		
		createWindow();
		}

}

