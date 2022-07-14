public class Funciones {

    /*

    Linea 1
    Linea 2

     */
    // Para JavaDOC -> /** */
    public static void main(String[] args){
        double area = getCircleArea(3);
        
        System.out.println("area = " + area);

        // Area de una esfera
        System.out.println("sphereArea(3) = " + sphereArea(3));
        // Volumen de una esfera
        System.out.println("sphereVolume(3) = " + sphereVolume(3));

        // Pesos a dolares
        System.out.println("convertToDollar(20,\"MXN\") = " + convertToDollar(20,"MXN"));
    }

    // Static -> son para métodos que comparten en el método main
    public static double getCircleArea(double radius){
        return (Math.PI * Math.pow(radius,2));
    }

    public static double sphereArea(double radius){
        return 4 * Math.PI * Math.pow(radius,2);
    }

    public static double sphereVolume(double radius){
        return (4/3) * Math.PI * Math.pow(radius,3);
    }



    /**
     * Descripción: Función que especificando su moneda convierte una cantidad de dinero a dolares
     * @param quantity Cantidad de dinero
     * @param currency Tipo de Moneda: Solo acepta MXN o COP
     * @return quantity Devuelve la cantidad actualizada en Dolares
     * */
    public static double convertToDollar(double quantity, String currency){
        switch (currency){
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;
    }
}
