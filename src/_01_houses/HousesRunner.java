package _01_houses;

import javax.swing.JOptionPane;

public class HousesRunner {

	public static void main(String[] args) {
		

		JOptionPane.showConfirmDialog(null, "Small, Moderate, Large");
		//Here we call the run() method from the Houses class
		Houses houseBuilder = new Houses();
		houseBuilder.run();
		Houses house = new Houses();
		houseBuilder.cool();
		Houses house1 = new Houses();
		houseBuilder.nice();

	}

}
