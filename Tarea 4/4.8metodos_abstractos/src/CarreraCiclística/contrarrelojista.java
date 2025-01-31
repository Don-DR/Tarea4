package CarreraCiclística;

public class contrarrelojista extends Ciclista {

private double velocidadMáxima;

public contrarrelojista(int identificador, String nombre, double 
velocidadMáxima) {
 super(identificador, nombre);
 this.velocidadMáxima = velocidadMáxima;}

protected double getVelocidadMáxima() {return velocidadMáxima;}
protected void setVelocidadMáxima(double velocidadMáxima) {this.velocidadMáxima = velocidadMáxima;}

protected void imprimir() {
 super.imprimir(); // Invoca el método imprimir de la clase padre
 System.out.println("Aceleración promedio = " + velocidadMáxima);}

protected String imprimirTipo() {return "Es un constrarrelojista";}
    
}
