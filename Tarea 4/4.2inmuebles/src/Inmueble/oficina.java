package Inmueble;

public class oficina extends local {
    protected static double valorArea = 3500000;
 // Atributo que identifica si una oficina pertenece o no al gobierno
 protected boolean esGobierno;

 public oficina(int identificadorInmobiliario, int área, String 
dirección, tipo tipoLocal, boolean esGobierno) {
 // Invoca al constructor de la clase padre
 super(identificadorInmobiliario, área, dirección, tipoLocal);
 this.esGobierno = esGobierno;
 }

 void imprimir() {
    super.imprimir(); // Invoca al método imprimir de la clase padre
    System.out.println("Es oficina gubernamental =" + esGobierno);
    System.out.println();
    }
    
}
