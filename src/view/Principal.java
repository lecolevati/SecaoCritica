package view;

import controller.ThreadCalc;

public class Principal {

	public static void main(String[] args) {
		
		for (int i = 2 ; i <= 3 ; i++){
			Thread t = new ThreadCalc(i);
			t.start();
		}
	}

}
