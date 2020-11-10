package main;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		Empregado A = new Assalariado(1000);
	    Empregado C = new Comissionado(3000);
	    Empregado H = new Horista(20, 76);
	    
		List<Empregado> empregados = new ArrayList<Empregado>();
		empregados.add((Empregado) A);
		empregados.add((Empregado) C);
		empregados.add((Empregado) H);

	    for (Empregado empregado : empregados) {
		    System.out.println("\nSeu nome: "+empregado.getNome());
		    System.out.println("Seu sobrenome: "+empregado.getSobrenome());
		    System.out.println("Seu Vencimento do final do mês: R$"+empregado.Vencimento());
	    }  
	}

}
