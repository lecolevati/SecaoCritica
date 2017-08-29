package controller;

public class ThreadCalc extends Thread {
	
	private static double res;
	private int idThread;
	
	public ThreadCalc(int idThread) {
		this.idThread = idThread;
	}

	@Override
	public void run() {
		calc();
	}

	private void calc() {
		res = 1.0d;
		if (idThread % 2 == 0){
			for (int i = 1 ; i <= 10 ; i++){
				res = res * (double)idThread;
				System.out.println(res);
			}
		} else {
			for (int i = 1 ; i <= 10 ; i++){
				res = res / (double)idThread;
				System.out.println(res);
			}
		}

	}
}
