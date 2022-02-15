package cursojava.thread.tela;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {
	
	
	private JPanel jpanel = new JPanel(new GridBagLayout());
	
	private JLabel descricaoHora = new JLabel("Time thread 1");
	private JTextField mostrarTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("Time thread 2");
	private JTextField mostrarTempo2 = new JTextField();
	
	private JButton jbutton = new JButton("Start");
	private JButton jbutton2 = new JButton("Stop");
	
	
	public TelaTimeThread() {
		// TODO Auto-generated constructor stub
		
		setTitle("Minha tela de time com thread");
		setSize(new Dimension(240,240));
		setLocationRelativeTo(null);
		setResizable(false);
		
		
		
		GridBagConstraints  gridBagConstraints = new GridBagConstraints();// controle de posicionamento de components
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth =2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		
		add(jpanel, BorderLayout.WEST);
		
		descricaoHora.setPreferredSize(new Dimension(200, 25));		
		jpanel.add(descricaoHora, gridBagConstraints);
		
		mostrarTempo.setPreferredSize(new Dimension(200, 25));
		mostrarTempo.setEditable(false);
		gridBagConstraints.gridy  ++;
		jpanel.add(mostrarTempo, gridBagConstraints);
		
		
		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy  ++;
		jpanel.add(descricaoHora2, gridBagConstraints);
		
		mostrarTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy  ++;
		mostrarTempo2.setEditable(false);
		jpanel.add(mostrarTempo2, gridBagConstraints);
		
		
		gridBagConstraints.gridwidth =1;
		
		jbutton.setPreferredSize(new Dimension(92,25));
		gridBagConstraints.gridy  ++;
		jpanel.add(jbutton, gridBagConstraints);
		
		
		jbutton2.setPreferredSize(new Dimension(92,25));
		gridBagConstraints.gridx  ++;
		jpanel.add(jbutton2, gridBagConstraints);
		
		setVisible(true);
	}
}
