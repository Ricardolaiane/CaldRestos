package br.calcula.main;

import br.calcula.controle.ControleTelaInicial;
import br.calcula.modelo.Calculos;
import br.calcula.visao.TelaInicialVisao;

public class Main {

	public static void main(String[] args) {
		
	Calculos c = new Calculos();
	 TelaInicialVisao tela = new TelaInicialVisao();
	 ControleTelaInicial controle = new ControleTelaInicial(tela, c);
	
	 
	 
	}

	
}
