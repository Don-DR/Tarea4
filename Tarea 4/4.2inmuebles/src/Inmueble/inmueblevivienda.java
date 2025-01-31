package Inmueble;

public class inmueblevivienda extends Inmueble {

    protected int númeroHabitaciones,númeroBaños  ;

    public inmueblevivienda(int identificadorInmobiliario, int área,
     String dirección, int númeroHabitaciones, int númeroBaños) {super(identificadorInmobiliario, área, dirección); /* Invoca al 
   constructor de la clase padre */
    this.númeroHabitaciones = númeroHabitaciones;
    this.númeroBaños = númeroBaños;
    }

    void imprimir() {
    super.imprimir(); // Invoca al método imprimir de la clase padre
    System.out.println("Número de habitaciones = "+ númeroHabitaciones);
    System.out.println("Número de baños ="  + númeroBaños);
    }
    
}
