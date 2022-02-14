package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// thread de envio de email
		new Thread() {
			public void run() {// execulta o que queremos
				// codigo sera execultado em paralelo
				for (int pos = 0; pos < 10; pos++) {

					System.out.println("Executando rotina de envio de email");
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start(); // liga a thread que fica processando paralelamente

		
		// DIVISAO DAS THREADS
		
		
		// thread de envio de email
		new Thread() {
			public void run() {// execulta o que queremos
				// codigo sera execultado em paralelo
				for (int pos = 0; pos < 10; pos++) {

					System.out.println("Executando rotina de enVIO DE NOTA FISCAL");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start(); // liga a thread que fica processando paralelamente

		Thread.sleep(5000);
		System.out.println("Chegou ao FIM do codigo de thread");
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
	}
	
	

}
