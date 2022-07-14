public class WhileLoop {

    public static boolean isTurnOnLight = false;

    public static void main(String[] args){
        turnOnOffLight();

        int i = 0;
        while(isTurnOnLight && i<=10){
            printSOS();
            i++;
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
