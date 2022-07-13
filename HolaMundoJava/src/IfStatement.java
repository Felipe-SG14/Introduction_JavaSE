public class IfStatement {
    public static void main(String[] args) {

        boolean isBluetoothEnabled = false;
        int fileSended = 3;

        // Scope -> espacio entre llaves { scope }

        // La variable a utilizar dentro del scope
        // debe declararse antes de las llaves

        // Variables declaradas dentro del scope,
        // Solo se pueden utilizar dentro del scope

        if (isBluetoothEnabled){
            fileSended++;
            System.out.println("¡Archivo enviado!");
            System.out.println("fileSended = " + fileSended);
            int i = 0;
            // Accediendo a variables declaradas dentro del scope
            System.out.println("i = " + i);
        } else {
            System.out.println("Encidnete tu bluetooth...");
        }

        //Utilizando variables declaradas fuera del scope
        System.out.println("fileSended = " + fileSended);
        System.out.println("isBluetoothEnabled = " + isBluetoothEnabled);

    }
}
