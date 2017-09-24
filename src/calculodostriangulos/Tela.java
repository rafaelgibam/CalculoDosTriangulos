package calculodostriangulos;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela {

	String resultado = "Nenhum Resultado Especificado";
	
	Tela(){
	
	// Componentes do JPanel
	JTextField tfl1 = new JTextField(20);
	JLabel lbl1 = new JLabel("Lado 1:");
	
	JTextField tfl2 = new JTextField(20);
	JLabel lbl2 = new JLabel("Lado 2:");
	
	JTextField tfl3 = new JTextField(20);
	JLabel lbl3 = new JLabel("Lado 3:");
	
	JButton jbv = new JButton("Verificar Tipo");
	
	JLabel lbresult = new JLabel(resultado);
	
	jbv.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			CalculaTriangulo c = new CalculaTriangulo();
			c.setLado1(tfl1.getText());
			c.setLado2(tfl2.getText());
			c.setLado3(tfl3.getText());
			resultado = c.getTipo();
			lbresult.setText(resultado);
		}
	});
			
		
	// Configurações do JFrame	
	JFrame jf = new JFrame("Teste dos Triangulos");
	
	Container ctMain =  jf.getContentPane();
	ctMain.setLayout(null);
	
	//Adicionando no JPanel
	lbl1.setBounds(25, 60, 200, 30);
	ctMain.add(lbl1);
	
	tfl1.setBounds(80, 60, 200, 30);
	ctMain.add(tfl1);
	
	lbl2.setBounds(25, 100, 200, 30);
	ctMain.add(tfl2);
	
	tfl2.setBounds(80, 100, 200, 30);
	ctMain.add(lbl2);
	
	lbl3.setBounds(25, 140, 200, 30);
	ctMain.add(lbl3);
	
	tfl3.setBounds(80, 140, 200, 30);
	ctMain.add(tfl3);
	
	jbv.setBounds(25, 220, 256, 30);
	ctMain.add(jbv);
	
	lbresult.setBounds(355, 0, 200, 300);
	ctMain.add(lbresult);
	
	jf.setSize(600, 350);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jf.setLocationRelativeTo(null);
	jf.setResizable(false);
	jf.setVisible(true);

	}
	
	
}
