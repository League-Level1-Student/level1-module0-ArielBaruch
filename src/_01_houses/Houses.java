package _01_houses;

import java.awt.AWTException;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot r = new Robot();

	public static void main(String[] args) {
		r.setX(50);
		r.setY(540);
		for (int i = 0; i < 4; i++) {
			String a = JOptionPane.showInputDialog(null, "what is the height you want the house to be?");
			String color = JOptionPane.showInputDialog("Green, Blue, or Red for your new house?");
			int c = Integer.parseInt(a);
			if (c <= 60) {
				small();
			} else if (c <= 120) {
				medium();
			} else {
				large();
			}
		}
	}

	public static void small() {

		r.setSpeed(10);
		
		r.penDown();
		r.move(60);
		String p = JOptionPane.showInputDialog("Do you want your roof flat or pointy?");
		if (p.contentEquals("pointy")) {
			r.turn(30);
			r.move(30);
			r.turn(125);
			r.move(30);
			r.turn(25);
		} else {
			r.turn(90);
			r.move(30);
			r.turn(90);
		}

		r.move(60);
		r.setPenColor(0, 150, 0);
		r.turn(-90);
		r.move(30);
		r.turn(-90);

	}

	public static void medium() {
		r.setSpeed(10);
		r.setPenColor(150, 0, 0);
		r.penDown();
		r.move(120);
		String p = JOptionPane.showInputDialog("Do you want your roof flat or pointy?");
		if (p.contentEquals("pointy")) {
			r.turn(30);
			r.move(30);
			r.turn(125);
			r.move(30);
			r.turn(25);
		} else {
			r.turn(90);
			r.move(30);
			r.turn(90);
		}

		r.move(120);
		r.setPenColor(0, 150, 0);
		r.turn(-90);
		r.move(30);
		r.turn(-90);
	}

	public static void large() {
		r.setSpeed(10);
		r.setPenColor(150, 0, 0);
		r.penDown();
		r.move(250);
		String p = JOptionPane.showInputDialog("Do you want your roof flat or pointy?");
		if (p.contentEquals("pointy")) {
			r.turn(30);
			r.move(30);
			r.turn(125);
			r.move(30);
			r.turn(25);
		} else {
			r.turn(90);
			r.move(30);
			r.turn(90);
		}

		r.move(250);
		r.setPenColor(0, 150, 0);
		r.turn(-90);
		r.move(30);
		r.turn(-90);
	}

}
