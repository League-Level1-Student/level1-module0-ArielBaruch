package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class soundEffectsMachine implements ActionListener {
	static JButton button = new JButton();
	public static void main(String[] args) {
	
	soundEffectsMachine sound = new soundEffectsMachine();
		
	JFrame frame = new JFrame();
	
	frame.setVisible(true);
	
	JPanel panel = new JPanel();
	
	frame.add(panel);
	
	panel.add(button);
	
	sound.GUI();
	
	frame.pack();
	}
	
	 void GUI() {
	
		button.addActionListener(this);
	
		
	}
	
	private void playSound(String fileName) {

	    AudioClip sound = JApplet.newAudioClip(getClass().getResource("yayeet.wav")); 

	    sound.play();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JButton buttonPressed = (JButton) e.getSource();
		
		if(buttonPressed == button) {
			
			playSound("yayeet.wav");
		
		}
		

		
	}	
	

}
