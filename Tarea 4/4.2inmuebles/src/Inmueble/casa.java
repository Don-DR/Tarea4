package Inmueble;

public class casa extends inmueblevivienda {
protected int númeroPisos; 



public casa(int identificadorInmobiliario, int área, String dirección, 
int númeroHabitaciones, int númeroBaños, int númeroPisos) {
// Invoca al constructor de la clase padre
super(identificadorInmobiliario, área, dirección, 
númeroHabitaciones, númeroBaños);
this.númeroPisos = númeroPisos;
}

void imprimir() {
super.imprimir(); 
System.out.println("Número de pisos ="  + númeroPisos);
}
}
