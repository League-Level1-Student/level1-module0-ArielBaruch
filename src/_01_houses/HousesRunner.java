package _01_houses;

import javax.swing.JOptionPane;

public class HousesRunner {

	public static void main(String[] args) {
		

		
		//Here we call the run() method from the Houses class
		Houses houseBuilder = new Houses();
		houseBuilder.small();
		Houses house = new Houses();
		houseBuilder.medium();
		Houses house1 = new Houses();
		houseBuilder.large();
		
		

	}

}
