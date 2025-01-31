package Inmueble;

public class casaindependiente extends casaurbana  {

    protected static double valorArea = 3000000;

    public casaindependiente(int identificadorInmobiliario, int área, 
    String dirección, int númeroHabitaciones, int númeroBaños, int 
    númeroPisos) {
     // Invoca al constructor de la clase padre
     super(identificadorInmobiliario, área, dirección, 
    númeroHabitaciones, númeroBaños, númeroPisos);
     }
     /**
     * Método que muestra en pantalla los datos de una casa independiente
     */
     void imprimir() {
     super.imprimir(); // Invoca al método imprimir de la clase padre
     System.out.println();
     }
    
}
