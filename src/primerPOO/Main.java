package primerPOO;

public class Main {

	public static void main(String[] args) {
		
		//Instanciar la clase... declarar miAnimal como un Objeto de la clase Animales
		Animales miAnimal = new Animales();
		
		miAnimal.nombre="Misifu";
		miAnimal.iD=1;
		miAnimal.edad=14;
		miAnimal.mostrarNombre();
		miAnimal.mostrarCaracteristicas();
		
		miAnimal.nombre="Guffi";
		miAnimal.mostrarNombre();
	
	
	
	}

}
