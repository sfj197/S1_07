package n1ejercicio1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TrabajadorOnline trabajadorO = new TrabajadorOnline("Jorge","Gomez",12);
		TrabajadorPresencial trabajadorP = new TrabajadorPresencial("Andres","Perez",14);
		
		System.out.println(trabajadorO.calcularSueldo(40));
		System.out.println(trabajadorP.calcularSueldo(40));
		System.out.println(trabajadorO);
		System.out.println(trabajadorP);
	}

}
