package n1ejercicio2;

public  class Trabajador {
	
	protected String nombre;
	protected String apellido;
	protected  int precioHora;
	
	public Trabajador(String nombre,String apellido,int precioHora) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.precioHora = precioHora;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getPrecioHora() {
		return precioHora;
	}

	public void setPrecioHora(int precioHora) {
		this.precioHora = precioHora;
	}
	
	public  int calcularSueldo(int numHoras) {
		
		int sueldo = 0;
		
		sueldo = numHoras * precioHora;
		
		return sueldo;	
		
	}

	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", apellido=" + apellido + ", precioHora=" + precioHora + "]";
	}
	

	

}
