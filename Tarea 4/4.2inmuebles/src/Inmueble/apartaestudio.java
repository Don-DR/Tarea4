package Inmueble;

public class apartaestudio extends apartamento {

    protected static double valorArea = 1500000;

 public apartaestudio(int identificadorInmobiliario, int área, String dirección, int númeroHabitaciones, int númeroBaños) {
 // Invoca al constructor de la clase padre
 super(identificadorInmobiliario, área, dirección, 1, 1);
 }

 void imprimir() {
 super.imprimir(); // Invoca al método imprimir de la clase padre
 System.out.println();
 }
    
}
