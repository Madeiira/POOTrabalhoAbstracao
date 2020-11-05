package main;

import java.util.ArrayList;
import java.util.List;

public class main {
	 public static void main(String[] args) {

		 Funcionario P = new Presidente(10000); 
		 
		 Funcionario S1 = new SecretariaAdministrativa(1000); 
		 Funcionario S2 = new SecretariaAgencia(1000); 
		 
		 Funcionario D = new Diretor(1000);
		 Funcionario G = new Gerente(1200);
		 
		    System.out.println("Seu Cargo: "+P.getCargo());
		    System.out.println("Seu salario: R$"+P.getSalario());
		    System.out.println("Seu salario + Bonificação: R$"+P.getBonificacao());
		 
		    List<Secretaria> secretarias = new ArrayList<Secretaria>();
		    secretarias.add((Secretaria) S1);
		    secretarias.add((Secretaria) S2);

		    for (Secretaria secretaria : secretarias) {
			    System.out.println("\nSeu Cargo: "+secretaria.getCargo());
			    System.out.println("Seu salario: R$"+secretaria.getSalario());
			    System.out.println("Seu salario + Bonificação: R$"+secretaria.getBonificacao());
		    }    
		    
		    List<Gerente> gerentes = new ArrayList<Gerente>();
		    gerentes.add((Gerente) D);
		    gerentes.add((Gerente) G);

		    for (Gerente gerente : gerentes) {
			    System.out.println("\nSeu Cargo: "+gerente.getCargo());
			    System.out.println("Seu salario: R$"+gerente.getSalario());
			    System.out.println("Seu salario + Bonificação: R$"+gerente.getBonificacao());
		    } 
	 }
}
