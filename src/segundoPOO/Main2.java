package segundoPOO;

import java.util.Scanner;

public class Main2 {
	
	public static void main(String[] args) {
		
		Personas p = new Personas();
		
		p.Edad=26;
		p.Nombre="Jose Luis";
		p.Estatura=1.83;
		
		p.CumpliAnos();
		p.Saludar();
		System.out.println("Cuando cumplas años tendas " +p.Edad);
		
		System.out.print("Cuanto has crecido?  -> ");
		
		double Incremento = new Scanner(System.in).nextDouble();

		p.Crecer(Incremento);
		
		System.out.printf("La Altura total es ->  %.2f" ,p.Estatura);
		
	}

}
