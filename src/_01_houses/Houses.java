package _01_houses;

import java.awt.AWTException;

import javax.swing.JOptionPane;


import org.jointheleague.graphical.robot.Robot;


public class Houses {
	Robot r = new Robot();
	
	
	
	
	public void run() {
		
		r.setX(50);
		r.setY(540);		
		r.setSpeed(10);
		r.setPenColor(150, 0 , 0);
		r.penDown();
		r.move(80);
		r.turn(30);
		r.move(30);
		r.turn(125);
		r.move(30);
		r.turn(25);
		r.move(80);
		r.setPenColor(0, 150, 0);
		r.turn(-90);
		r.move(30);
		r.turn(-90);
	}
	public void cool() {
		r.setPenColor(0,0,40);
		r.move(200);
		r.turn(90);
		r.move(20);
		r.turn(90);
		r.move(200);
		r.setPenColor(0,150,0);
		r.turn(-90);
		r.move(30);
		r.turn(-90);
	}
	public void nice() {
		r.setPenColor(0,0,150);
		r.move(360);
		r.turn(30);
		r.move(30);
		r.turn(125);
		r.move(30);
		r.turn(90);
		r.move(360);
		r.setPenColor(0,150,0);
		r.turn(-90);
		r.move(30);
		r.turn(-90);
	}
}

