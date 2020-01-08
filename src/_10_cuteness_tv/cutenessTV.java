package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cutenessTV implements ActionListener{
	static cutenessTV TV = new cutenessTV();
	static JButton button1 = new JButton();
	
	static JButton button2 = new JButton();
	
	static JButton button3 = new JButton();
	
	public static void main(String[] args) {
	
	
	JFrame frame = new JFrame();
	
	JPanel panel = new JPanel();
	
	frame.add(panel);
	
	frame.setVisible(true);
	
	panel.add(button1);
	
	panel.add(button2);
	
	panel.add(button3);
	
	button1.setText("Ducks!");
	
	button2.setText("Frog!");
	
	button3.setText("Unicorns!");
	
	TV.J();
	
	frame.pack();
	}
	void J() {
		
	button1.addActionListener(this);
	
	button2.addActionListener(this);
	
	button3.addActionListener(this);
	
	}
	public void actionPerformed(ActionEvent j) {
		// TODO Auto-generated method stub
		
		JButton buttonPressed = (JButton) j.getSource();
		
		if(buttonPressed == button1) {
		showDucks();
		}	
		if(buttonPressed == button2) {
			showFrog();
		}
		if(buttonPressed == button3) {
			showFluffyUnicorns();
		}	
	}
		void showDucks() {
		     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
		}

		void showFrog() {
		     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
		}

		void showFluffyUnicorns() {
		     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
		}

		void playVideo(String videoID) {
		     try {
		          URI uri = new URI(videoID);
		          java.awt.Desktop.getDesktop().browse(uri);
		     } catch (Exception e) {
		          e.printStackTrace();
		     }
		}
		
}

