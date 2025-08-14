import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Programa para realizar calculos de la escuacion lineal");

        //creando objeto para la lectura de datos de entrada
        Scanner lector=new Scanner(System.in);

        //leer datos de entrada
        System.out.println("coordenadas del segundo punto");
        System.out.print("x?");
        double x1=lector.nextDouble();
        System.out.print("y?");
        double y1=lector.nextDouble();

        System.out.println("coordenadas del segundo punto");
        System.out.print("x?");
        double x2=lector.nextDouble();
        System.out.print("y?");
        double y2=lector.nextDouble();

        //proceso
        double distancia = Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));
        double m = (y2-y1) / (x2-x1);
        double b = y2 - m * x2;
        String ecuacion = "y = (" + m + ") * x + (" + b + ")";
        //salida
        System.out.println("La distancia entre los puntos es " + distancia);
        System.out.println("La ecuacion de la recta es" + ecuacion);
        



    
    }
}
