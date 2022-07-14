public class ForLoop {
    static boolean isTurnOnLight = false;


    // Break    -> Rompe un ciclo
    // Continue -> No termina el ciclo, pero regresa a la evaluación de la condición
    // return   -> Termina de ejecutar la función y retorna el valor

    public static void main(String[] args) {
        turnOnOffLight();
        for (int i = 0 ; i<10; i++){
            printSOS();
        }
    }

    public static void printSOS(){
        System.out.println(". . . _ _ _ . . .");
    }

    public static boolean turnOnOffLight(){
        // Operador ternario
        // (expresión a evaluar) ? valor_true : valor_false;
        isTurnOnLight = isTurnOnLight ? false : true;
        return isTurnOnLight;
    }
}
