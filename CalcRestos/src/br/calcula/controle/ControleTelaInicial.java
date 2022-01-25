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
				
				aux1= String.format("2.f", c.calcularResto(aDouble, aDouble2));
				tvi.getPanel().add(tvi.getLabel(), aux1);
			
				
			}
			
		});
		
	}

}
