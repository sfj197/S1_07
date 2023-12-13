package n1ejercicio1;

public class TrabajadorPresencial extends Trabajador {

	private static int gasolina;
	
	public TrabajadorPresencial(String nombre,String apellido,int precioHora) {
		
		super(nombre,apellido,precioHora);
		TrabajadorPresencial.gasolina = 50;
		
	}
	
	@Override
	
	public int calcularSueldo(int numHoras) {
		
		int sueldo = 0;
		
		sueldo = numHoras * super.precioHora + gasolina;
		
		return sueldo;
	}
	
	@Override
	public String toString() {
		return "TrabajadorPresencial [nombre=" + super.nombre + ", apellido=" + super.apellido + ", precioHora=" + super.precioHora + "]";
	}

}
