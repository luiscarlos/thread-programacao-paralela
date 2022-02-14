package cursojava.thread.tela;

import java.awt.Dimension;

import javax.swing.JDialog;

public class TelaTimeThread extends JDialog {
	public TelaTimeThread() {
		// TODO Auto-generated constructor stub
		
		setTitle("Minha tela de time com thread");
		setSize(new Dimension(240,240));
		setLocationRelativeTo(null);
		setResizable(false);
		
		setVisible(true);
	}
}
