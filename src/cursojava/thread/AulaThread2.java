package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread2 {

	public static void main(String[] args) throws InterruptedException {
		

		// thread de envio de email
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		
		
		
		
		// DIVISAO DAS THREADS
		
		
		// thread de envio de email
		Thread threadEnviarNFCE = new Thread(thread2);
		threadEnviarNFCE.start();
	
		Thread.sleep(5000);
		System.out.println("Chegou ao FIM do codigo de thread");
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
	}
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			// codigo sera execultado em paralelo
			for (int pos = 0; pos < 10; pos++) {

				System.out.println("Executando rotina de envio de email");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	};
	
	private static Runnable thread2 =  new Runnable() {

	public void run() {
		// codigo sera execultado em paralelo
		for (int pos = 0; pos < 10; pos++) {

			System.out.println("Executando rotina de enVIO DE NOTA FISCAL");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
};
	}
