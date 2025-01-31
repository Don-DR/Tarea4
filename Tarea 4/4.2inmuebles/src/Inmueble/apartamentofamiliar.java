package Inmueble;

public class apartamentofamiliar extends apartamento {
    


    protected static double valorArea = 2000000;
    protected int valoradministración;

    public apartamentofamiliar(int identificadorInmobiliario, int área, 
   String dirección, int númeroHabitaciones, int númeroBaños, int 
   valoradministración) {
    // Invoca al constructor de la clase padre
    super(identificadorInmobiliario, área, dirección, 
   númeroHabitaciones, númeroBaños);
    this.valoradministración = valoradministración;
    }

    void imprimir() {
    super.imprimir(); // Invoca al método imprimir de la clase padre
    System.out.println("Valor de la administración = $" + valoradministración);
    System.out.println();
    }
}
