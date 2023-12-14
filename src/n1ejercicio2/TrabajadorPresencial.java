package n1ejercicio2;

public class TrabajadorPresencial extends Trabajador {

	private static int gasolina;
	
	public TrabajadorPresencial(String nombre,String apellido,int precioHora) {
		
		super(nombre,apellido,precioHora);
		TrabajadorPresencial.gasolina = 50;
		
	}
	
	@Override
	
	public int calcularSueldo(int numHoras) {
		
		int sueldo = 0;
		
		sueldo = super.calcularSueldo(numHoras) + gasolina;
		
		return sueldo;
	}
	
	@Deprecated
	
	public int incentivo(int numHoras) {
		int incentivo = 0;
		
		incentivo = (int) (calcularSueldo(numHoras)*0.05);
		
		return incentivo;
		
		
	}
	
	@Override
	public String toString() {
		return "TrabajadorPresencial [nombre=" + super.nombre + ", apellido=" + super.apellido + ", precioHora=" + super.precioHora + "]";
	}

}
