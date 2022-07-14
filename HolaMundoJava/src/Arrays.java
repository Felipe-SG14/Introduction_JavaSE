public class Arrays {
    public static void main(String[] args) {

        // Declarando arreglos
        // La convención de nombre indica que los nombre de arreglos van en plural
        // Una vez declarado el tamaño asi sera en todo el programa
        String[] androidVersions = new String[17];
        String days[] = new String[7];

        // Arreglo de dos dimensiones
        // TipoDeDato[row][columns]
        String[][] cities = new String[4][2];
        /*
                 Mexico   - CDMX
                 Mexico   - Guadalajara
                 Colombia - Bogota
                 Colombia - Medellin
         */

        // Arreglos de tres dimensiones
        // [row][column][thickness]
        int[][][] intArrays = new int[2][2][2];

        // Arreglos de más dimensiones
        int[][][][] numbers4 = new int[2][2][2][2];

        // Definiendo valores en arreglos
        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Bannana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        for(int i = 0 ; i < androidVersions.length ; i++){
            System.out.println("androidVersions["+i+"]"+" = " + androidVersions[i]);
        }

        System.out.println();
        System.out.println();

        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogota";
        cities[2][0] = "Mexico";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "Mexico";
        cities[3][1] = "CDMX";

        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println("cities["+i+"]["+j+"]"+ cities[i][j]);
            }
        }


        String[][][][] animals = new String[2][3][2][2];

        // Uso del for-each
        for (String element : androidVersions) {
            System.out.println(element);
        }

        // For each para arreglos de doble dimensión
        for (String[] pair: cities) {
            for (String element: pair) {
                System.out.println(element);
            }
        }
    }
}
