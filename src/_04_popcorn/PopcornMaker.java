package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Popcorn pop = new Popcorn(JOptionPane.showInputDialog("What flavor would you like?"));
		Microwave micro = new Microwave();
		micro.putInMicrowave(pop);
		micro.setTime(Integer.parseInt(JOptionPane.showInputDialog("How many minutes should it be cooked? Please only input an integer.")));
		micro.startMicrowave();
		
	}

}
