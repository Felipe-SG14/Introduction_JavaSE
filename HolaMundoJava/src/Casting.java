public class Casting {
    public static void main(String[] args) {
        
        // Cast
        
        // En un año ubique 30 perritos
        // Cuantos perritos ubique al mes
        
        double monthlyDogs = 30.0/12.0;
        System.out.println("monthlyDogs = " + monthlyDogs);
        
        // Estimación
        // Cast a int "trunca el double"
        int estimatedMontthlyDogs = (int) monthlyDogs;
        System.out.println("estimatedMontthlyDogs = " + estimatedMontthlyDogs);
        
        
        // Exactitud
        // Casting a double
        int a = 30;
        int b = 12;
        System.out.println("(double)a/b = " + (double)a/b);
        
        // Casteo a double
        double c = (double) a/b;
        System.out.println("c = " + c);
        
        //
        
        char n = '1';
        int nI = n;
        System.out.println("nI = " + nI);
        
        // Un char es mas grande que un short
        short nS = (short) n;
        System.out.println("nS = " + nS);
    }
}
