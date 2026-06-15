import java.util.Random;
/**
 * Clase de ejecución principal para validar la generación de objetos aleatorios.
 */
public class Main {
 public static void main(String[] args) {
 Random rand = new Random();
 // Generación de valores aleatorios válidos
 int posX = rand.nextInt(50) + 1;

 int posY = rand.nextInt(50) + 1;
 double radioAleatorio = 2.0 + (15.0 - 2.0) * rand.nextDouble();
 double alturaAleatoria = 5.0 + (30.0 - 5.0) * rand.nextDouble();
 // Instanciación única del objeto Cono
 Cono conoPrueba = new Cono(posX, posY, radioAleatorio, alturaAleatoria);
 System.out.println("=================================================");
 System.out.println(" INFORME DE OBJETO GEOMÉTRICO GENERADO");
 System.out.println("=================================================");
 conoPrueba.imprimir();
 System.out.println("=================================================");
 }
}
