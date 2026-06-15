/**
 * Clase que representa un punto en un plano bidimensional.
 * Servirá como base para estructuras geométricas concéntricas.
 *
 * @author Alexandro Santana Pulido
 * @version 1.0
 */
public class Punto {
 private int x;
 private int y;
 /**
 * Constructor por defecto que inicializa el punto en el origen (0,0).
 */
 public Punto() {
 this.x = 0;
 this.y = 0;
 }
 /**
 * Constructor con parámetros.
 * @param x Coordenada en el eje horizontal.
 * @param y Coordenada en el eje vertical.
 */
 public Punto(int x, int y) {
 this.x = x;
 this.y = y;
 }
 public int getX() { return x; }
 public void setX(int x) { this.x = x; }
 public int getY() { return y; }
 public void setY(int y) { this.y = y; }

 /**
 * Muestra por consola las coordenadas actuales del punto.
 */
 public void imprimir() {
 System.out.println("Coordenadas del Centro -> X: " + x + ", Y: " + y);
 }
}
