public class DataTypes {
    public static void main(String[] args) {

        // Datos numéricos

        // Enteros
        /*
            byte  -> -128 a 127
            short -> -32768 a 32767
            int   -> -2147483648 a 2147483647
            long  ->
         */
        int n = 1234567890;
        System.out.println("n = " + n);
        // Agregar una L al final de un tipo de datos Long
        long nL = 1234567890L;
        System.out.println("nL = " + nL);


        //Flotantes
        /*
            float
            double
         */

        //Declarando double
        double nD = 123.1516513;
        System.out.println("nD = " + nD);
        float  nF = 121365.61651f;
        System.out.println("nF = " + nF);

        //Datos para texto
        /*
            char -> Unico caracter y utilizar siempre comillas simple
         */

        char c = 24;

        //Boolean
        /*
            true or false
         */

        // Dato genérico
        // Java infiere el tipo de dato
        var salary = 1000;           //Int
        var pension = salary*0.03;   //Double
        System.out.println("salary = " + salary);
        System.out.println("pension = " + pension);
        
        var totalSalary = salary - pension;
        System.out.println("totalSalary = " + totalSalary);

        // Cadenas de texto
        var employeeName = "Anahi Salgado";
        System.out.println("Employee: " + employeeName + " Salary: " + totalSalary);
    }
}
