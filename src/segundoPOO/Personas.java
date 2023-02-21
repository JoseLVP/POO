package segundoPOO;

public class Personas {

	String Nombre;
	int Edad;
	double Estatura;
	
	
	public void Saludar() {
		System.out.println("Hola, mi nombre es " +Nombre+ " Encantando de Conocerte");
		
	}

	public void CumpliAnos() {
		Edad++;
		
	}
	
	public  void Crecer(double Incremento) {
		Estatura+=Incremento;
		
	}
}
