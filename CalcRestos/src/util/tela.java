package util;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.SwingConstants;


public class tela {
	
	
	private JFrame frmCalculadoraDeRestos = new JFrame();
	private JTextField textField;
	private JTextField textField_1;
	private JButton botao = new JButton("Calcular");
	JPanel panel = new JPanel();
	private JLabel label = new JLabel("");
	
	
	public tela(){	
		
	GridBagConstraints c = new GridBagConstraints();
	GridBagConstraints d = new GridBagConstraints();
	frmCalculadoraDeRestos.setTitle("Calculadora de Restos");
		
		
	frmCalculadoraDeRestos.setSize(300, 200);
	frmCalculadoraDeRestos.setDefaultCloseOperation(frmCalculadoraDeRestos.EXIT_ON_CLOSE);
	
	
	panel.setBackground(Color.WHITE);
	frmCalculadoraDeRestos.getContentPane().add(panel, BorderLayout.CENTER);
	GridBagLayout gbl_panel = new GridBagLayout();
	gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
	gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
	gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	panel.setLayout(gbl_panel);
	
	JLabel lblNewLabel = new JLabel("Informe o valor que deseja calcular");
	lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
	GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
	gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
	gbc_lblNewLabel.gridwidth = 6;
	gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel.gridx = 1;
	gbc_lblNewLabel.gridy = 1;
	panel.add(lblNewLabel, gbc_lblNewLabel);
	
	textField = new JTextField();
	GridBagConstraints gbc_textField = new GridBagConstraints();
	gbc_textField.insets = new Insets(0, 0, 5, 5);
	gbc_textField.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField.gridx = 1;
	gbc_textField.gridy = 2;
	panel.add(textField, gbc_textField);
	textField.setColumns(10);
	
	JLabel lblNewLabel_1 = new JLabel("%");
	GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
	gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
	gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_1.gridx = 2;
	gbc_lblNewLabel_1.gridy = 2;
	panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
	
	textField_1 = new JTextField();
	textField_1.setColumns(10);
	GridBagConstraints gbc_textField_1 = new GridBagConstraints();
	gbc_textField_1.gridwidth = 3;
	gbc_textField_1.insets = new Insets(0, 0, 5, 5);
	gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_1.gridx = 3;
	gbc_textField_1.gridy = 2;
	panel.add(textField_1, gbc_textField_1);
	
	
	GridBagConstraints gbc_botao = new GridBagConstraints();
	gbc_botao.insets = new Insets(0, 0, 5, 5);
	gbc_botao.gridx = 6;
	gbc_botao.gridy = 2;
	panel.add(botao, gbc_botao);
	
	JLabel lblNewLabel_2 = new JLabel("Resultado:");
	GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
	gbc_lblNewLabel_2.fill = GridBagConstraints.BOTH;
	gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_2.gridx = 1;
	gbc_lblNewLabel_2.gridy = 3;
	panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
	
	GridBagConstraints gbc_label = new GridBagConstraints();
	gbc_label.insets = new Insets(0, 0, 5, 5);
	gbc_label.gridx = 1;
	gbc_label.gridy = 5;
	
	panel.add(label, gbc_label);
	
	
	System.err.println("aqui no painel");
	//panel.setLayout(null);
	

	
	
	frmCalculadoraDeRestos.setVisible(true);
	frmCalculadoraDeRestos.setResizable(false);
	
	}


	public JFrame getFrmCalculadoraDeRestos() {
		return frmCalculadoraDeRestos;
	}


	public void setFrmCalculadoraDeRestos(JFrame frmCalculadoraDeRestos) {
		this.frmCalculadoraDeRestos = frmCalculadoraDeRestos;
	}


	public JTextField getTextField() {
		return textField;
	}


	public void setTextField(JTextField textField) {
		this.textField = textField;
	}


	public JTextField getTextField_1() {
		return textField_1;
	}


	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}


	public JButton getBotao() {
		return botao;
	}


	public void setBotao(JButton botao) {
		this.botao = botao;
	}


	public JPanel getPanel() {
		return panel;
	}


	public void setPanel(JPanel panel) {
		this.panel = panel;
	}


	public JLabel getLabel() {
		return label;
	}


	public void setLabel(JLabel label) {
		this.label = label;
	}


	

}
