package Animales;

public class prueba {
public static void main(String[] args) {
        Animal[] animales = new Animal[4]; /* Define un array de cuatro 
       elementos de tipo Animal */
        animales[0] = new gato();
        animales[1] = new perro();
        animales[2] = new lobo();
        animales[3] = new leon();
        for (int i = 0; i < animales.length; i++) { /* Recorre el array de 
       animales */
        System.out.println(animales[i].getNombreCientífico());
        System.out.println("Sonido: "+ animales[i].getSonido());
        System.out.println("Alimentos:" + animales[i].getAlimentos());
        System.out.println("Hábitat:" + animales[i].getHábitat());
        System.out.println();}

    
        }
}
       
