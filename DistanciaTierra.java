import java.util.Scanner;
/**
 * 
 * Herramienta para calcular distancia entre 2 puntos de la tierra.
 *
 * @author (GINinja)
 * @version (a version number or a date)
 */
public class DistanciaTierra
{
    
   public static void main(String[] args)
   {

      

       Scanner scanner = new Scanner(System.in);

      
       double x1,y1;

       double x2, y2;

      

       System.out.print("Ingrese la latitud 1: ");

       x1=scanner.nextDouble();

       System.out.print("Ingrese la longitud 1: ");

       y1=scanner.nextDouble();

      

       System.out.print("Ingrese la latitud 2: ");

       x2=scanner.nextDouble();

       System.out.print("Ingrese la longitud 2: ");

       y2=scanner.nextDouble();

      

       double distance;

       double radiusofEarth=6371.07;   //Radio de la tierra en KM 
       // se agrega el conversor de KM a Mi por sugerencia de Mr. Husband

       double kmToMile=0.62137119;

      

       distance=radiusofEarth*(Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2)));

      

       System.out.println("La distancia entre estos puntos es: "+distance+" en Kilometros o "+distance*kmToMile+" En millas.");

       

   }
    }

