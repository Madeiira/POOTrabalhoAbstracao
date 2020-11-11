package main;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		Empregado A = new Assalariado(1000);
		A.setCpf("265.455.456-15");
		A.setNome("Joao");
		A.setSobrenome("Paulo");

		Empregado C = new Comissionado(3000);
		C.setCpf("235.412.753-23");
		C.setNome("Jonas");
		C.setSobrenome("Dude");

		Empregado H = new Horista(20, 76);
		H.setCpf("245.466.152-14");
		H.setNome("Joana");
		H.setSobrenome("Lopes");

		List<Empregado> empregados = new ArrayList<Empregado>();
		empregados.add((Empregado) A);
		empregados.add((Empregado) C);
		empregados.add((Empregado) H);

		for (Empregado empregado : empregados) {
			System.out.println("\nSeu nome: " + empregado.getNome());
			System.out.println("Seu sobrenome: " + empregado.getSobrenome());
			System.out.println("Seu CPF: " + empregado.getCpf());
			System.out.println("Seu Vencimento do final do mês: R$" + empregado.Vencimento());
		}
	}

}
