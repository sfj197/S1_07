package n1ejercicio1;

public class TrabajadorOnline extends Trabajador {

	private final int tarifa;
	public TrabajadorOnline(String nombre, String apellido, int precioHora) {

		super(nombre, apellido, precioHora);
		
		this.tarifa = 50;

	}


	@Override
	public String toString() {
		return "TrabajadorOnline [nombre=" + super.nombre + ", apellido=" + super.apellido + ", precioHora=" + super.precioHora + "]";
	}


	@Override

	public int calcularSueldo(int numHoras) {

		int sueldo = 0;

		sueldo = super.calcularSueldo(numHoras) + tarifa;

		return sueldo;

	}

}
