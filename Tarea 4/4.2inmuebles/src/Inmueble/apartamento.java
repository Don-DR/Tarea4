package Inmueble;

public class apartamento extends inmueblevivienda {


    public apartamento(int identificadorInmobiliario, int área, String 
   dirección, int númeroHabitaciones, int númeroBaños) {
    // Invoca al constructor de la clase padre
    super(identificadorInmobiliario, área, dirección, 
   númeroHabitaciones, númeroBaños);
    }

    void imprimir() {
    super.imprimir(); 
    }}