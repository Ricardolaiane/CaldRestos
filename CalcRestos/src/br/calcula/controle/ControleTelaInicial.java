package br.calcula.controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import br.calcula.modelo.Calculos;
import br.calcula.visao.TelaInicialVisao;

public class ControleTelaInicial {
	
	private TelaInicialVisao tvi;
	private Calculos c;
	
		
	public ControleTelaInicial(TelaInicialVisao tiv, Calculos c) {
		this.tvi = tiv;
		this.c = c;
		eventos();
		
	}
	
	public void eventos() {
		
		tvi.getBotao().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double aDouble = Double.parseDouble(tvi.getTextField().getText());
				double aDouble2 = Double.parseDouble(tvi.getTextField_1().getText());
				String aux1="";
				String aux2=String.format(aux1, c.calcularResto(aDouble, aDouble2));
				
				tvi.getLabel().setText(String.format(aux1, c.calcularResto(aDouble, aDouble2)));
				
				System.out.println("valores do textfield" + aux2);
			
				
			}
			
		});
		
	}//		m.getPessoa().setCpf(vlm.getTextField().getText());

}
