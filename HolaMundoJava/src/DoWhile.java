import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){

        int response = 0;

        // La aplicación más común de un do while es un menú de opciones
        do {
            System.out.println("Selecciona el número de la opción deseada");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Salir");

            Scanner scanner = new Scanner(System.in);
            response = scanner.nextInt();

            switch (response){
                case 0:
                    System.out.println("Gracias por visitarnos...");
                    break;
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("Series");
                default:
                    System.out.println("Selecciona una opción correcta");
                    break;
            }
        } while (response!=0);

        System.out.println("Se termino el programa...");
    }
}
