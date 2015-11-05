package dobleDespacho;

public class Mujer extends Persona {

	public void alagar() {
		System.out.println("Soy una mujer ruborizada");
	}

	public void piropear() {
		System.out.println("Soy una mujer más ruborizada");
	}	
	
	@Override
	public void aceptar(Recepcionista recepcionista) {
		recepcionista.visitar(this);
	}

}
