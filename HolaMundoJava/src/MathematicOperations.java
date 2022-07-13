public class MathematicOperations {
    public static void main(String[] args) {

        // Clase Math

        double x = 2.1;
        double y = 3;
        
        // Constantes
        System.out.println("Math.PI = " + Math.PI);
        System.out.println("Math.E = " + Math.E);
        
        // Método ceil devuelve un entero hacia arriba
        System.out.println("Math.ceil(x) = " + Math.ceil(x));
        
        // Método ceil devuelve un entero hacia abajo
        System.out.println("Math.floor(x) = " + Math.floor(x));
        
        // Para elevar un número
        System.out.println("Math.pow(3,2) = " + Math.pow(3,2));
        
        // Devuelve el número mayor
        System.out.println("Math.max(1,2) = " + Math.max(1,2));
        
        // Devuelve la raiz cuadrada
        System.out.println("Math.sqrt(25) = " + Math.sqrt(25));
        
        // Area de un circulo
        System.out.println("(Math.PI * Math.pow(y,2)) = " + (Math.PI * Math.pow(y,2)));
        
        // Area de una esfera
        System.out.println("(4 * Math.PI * Math.pow(y,2)) = " + (4 * Math.PI * Math.pow(y,2)));
        
        // Volumen de una esfera 
        System.out.println("((4/3) * Math.PI * Math.pow(y,3)) = " + ((4/3) * Math.PI * Math.pow(y,3)));
    }
}
