package primerPOO;

public class Animales {

	//Atributos
	String nombre;
	int iD;
	int edad;
	
	//Metodos
	public void mostrarNombre() {
		System.out.println(nombre);
	}
	
	public void mostrarCaracteristicas() {
		System.out.println("Mi Animal se llama " +nombre + " tiene " +edad+" años y su ID es " +"id" +iD);
	}

}
