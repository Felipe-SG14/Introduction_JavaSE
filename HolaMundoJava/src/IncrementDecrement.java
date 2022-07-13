public class IncrementDecrement {
    public static void main(String[] args) {
        
        
        int lives = 5;
        
        // Se decrementa en uno
        lives = lives - 1;
        System.out.println("lives = " + lives);
        lives--;
        System.out.println("Se decrementa en 1: ");
        System.out.println("lives = " + lives);
        
        lives++;
        System.out.println("Se incrementa en 1:");
        System.out.println("lives = " + lives);

        // Pretfijo
        // Gana un regalo por ganar una vida
        int gift = 100 + lives++; //Postfijo, primero se asigna y luego se incrementa
        System.out.println("gift = " + gift);
        System.out.println("lives = " + lives);

        // Postfijo
        // Gana un regalo por ganar una vida
        gift = 100 + ++lives;
        System.out.println("gift = " + gift);
        System.out.println("lives = " + lives);
    }
}
