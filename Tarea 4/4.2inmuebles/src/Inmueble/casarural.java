package Inmueble;

public class casarural extends casa {
    
 protected static double valorArea = 1500000;
 protected int distanciaCabera, altitud; // distancia a la cabecera municipal

 public casarural(int identificadorInmobiliario, int área, String 
dirección, int númeroHabitaciones, int númeroBaños, int 
númeroPisos, int distanciaCabera, int altitud) {
 // Invoca al constructor de la clase padre
 super(identificadorInmobiliario, área, dirección, númeroHabitaciones, númeroBaños, númeroPisos);
 this.distanciaCabera = distanciaCabera;
 this.altitud = altitud;
 }

 
 void imprimir() {
 super.imprimir(); // Invoca al método imprimir de la clase padre
 System.out.println("Distancia la cabecera municipal =" + númeroHabitaciones + "km.");
 System.out.println("Altitud sobre el nivel del mar ="  + altitud + " metros.");
 System.out.println();
 }


}
