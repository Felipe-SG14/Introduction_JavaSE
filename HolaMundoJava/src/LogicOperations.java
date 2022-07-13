public class LogicOperations {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("A es igual a B? -> " + (a==b));
        System.out.println("A es diferente de B? -> " + (a!=b));

        // Operadores relacionales
        System.out.println("A es mayor que B? -> " + (a>b));
        System.out.println("A es menor que B? -> " + (a<b));

        System.out.println("A es mayor o igual que B -> " + (a>=b));
        System.out.println("A es menor o igual que B -> " + (a<=b));

        // Utilizando operadores relacionales en If's
        if (a==b){
            System.out.println("A es igual a B");
        } else if (a!=b) {
            System.out.println("A es diferente que B");
        } else if (a>b) {
            System.out.println("A es mayor que B");
        } else if (a<b) {
            System.out.println("A es menor que B");
        } else if (a>=b) {
            System.out.println("A es mayor o igual que B");
        } else if (a<=b){
            System.out.println("A es menor o igual que B");
        }
    }
}
