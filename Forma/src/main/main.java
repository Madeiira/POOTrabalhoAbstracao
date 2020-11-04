package main;

public class main {

	  public static void main(String[] args) {
		  
		    System.out.println("Olá mundo\n");

		    Forma q = new Quadrado(3);
		    Forma r = new Retangulo(5, 2);
		    Forma t = new Triangulo(2);
		    Forma c = new Circulo(3);

		    System.out.println("Area Do Quadrado: "+q.obterArea());
		    System.out.println("Perimetro do Quadrado: "+q.obterPerimetro());
		    
		    System.out.print("\n");
		    
		    System.out.println("Area Do Retangulo: "+r.obterArea());
		    System.out.println("Perimetro do Retangulo: "+r.obterPerimetro());
		    
		    System.out.print("\n");
		    
		    System.out.println("Area Do Triangulo: "+t.obterArea());
		    System.out.println("Perimetro do Triangulo: "+t.obterPerimetro());
		    
		    System.out.print("\n");
		    
		    System.out.println("Area Do Circulo: "+c.obterArea());
		    System.out.print("Perimetro do Circulo: "+c.obterPerimetro());
		    
	  }
}
