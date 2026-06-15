/**
 * Clase que representa un cono geométrico. Hereda las propiedades del Círculo
 * (el cual actúa como su base) y añade el atributo de la altura.
 *
 * @author Alexandro Santana Pulido
 * @version 1.0
 */
public class Cono extends Circulo {
 private double altura;
 /**
 * Constructor con parámetros para instanciar un cono completo.
 * @param x Coordenada X de la base.
 * @param y Coordenada Y de la base.
 * @param radio Radio de la base circular.
 * @param altura Altura del cono desde la base hasta la cúspide.
 */
 public Cono(int x, int y, double radio, double altura) {
 super(x, y, radio);
 this.altura = altura;
 }
 public double getAltura() { return altura; }
 public void setAltura(double altura) { this.altura = altura; }
 /**
 * Calcula el volumen total del cono empleando la fórmula matemática estándar.
 * @return Volumen del cono como double.
 */
 public double calcularVolumen() {
 return (1.0 / 3.0) * super.calcularArea() * altura;
 }
 /**
 * Muestra la información completa acumulada de todas las clases de la jerarquía.
 */
 @Override
 public void imprimir() {
 super.imprimir();
 System.out.printf("Propiedades del Cono -> Altura: %.2f | Volumen Total: %.2f%n",
altura, calcularVolumen());
 }
}
