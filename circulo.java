/**
 * Clase que representa un círculo. Hereda la posición de la clase Punto
 * y añade la propiedad del radio.
 *
 * @author Alexandro Santana Pulido
 * @version 1.0
 */
public class Circulo extends Punto {
 private double radio;
 /**
 * Constructor con parámetros para posicionar el círculo y definir su tamaño.
 * @param x Coordenada X del centro.
 * @param y Coordenada Y del centro.
 * @param radio Radio del círculo.
 */
 public Circulo(int x, int y, double radio) {
 super(x, y);
 this.radio = radio;
 }
 public double getRadio() { return radio; }
 public void setRadio(double radio) { this.radio = radio; }
 /**
 * Calcula el área de la superficie del círculo.
 * @return Área resultante como un valor double.
 */
 public double calcularArea() {
 return Math.PI * Math.pow(radio, 2);
 }
 /**
 * Muestra los datos del punto base junto con los atributos específicos del círculo.
 */
 @Override
 public void imprimir() {
 super.imprimir();
 System.out.printf("Propiedades del Círculo -> Radio: %.2f | Área de la Base: %.2f%n",
radio, calcularArea());
 }
}
