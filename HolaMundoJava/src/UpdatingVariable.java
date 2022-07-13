public class UpdatingVariable {
    public static void main(String[] args) {
        // Actualizando variables
        int salary = 1000;
        System.out.println("salary = " + salary);
        // bono = $200
        salary = salary + 200;
        System.out.println("Aplicando bono: ");
        System.out.println("salary = " + salary);
        
        // Pensión: $50
        salary = salary - 50;
        System.out.println("Descontando pensión: ");
        System.out.println("salary = " + salary);
        
        // Trabajo 2 horas extra $30 c/u
        // Comida: $45
        salary = salary + (2*30) - 45;
        System.out.println("Dando horas extra y cobrando comida: ");
        System.out.println("salary = " + salary);
        
        // Actualizando cadenas de texto
        String employeeName = "Felipe Solano";
        System.out.println("employeeName = " + employeeName);
        System.out.println("Agregando apellido: ");
        employeeName = employeeName + " Gonzalez";
        System.out.println("employeeName = " + employeeName);
        System.out.println("Tu nombres es: " + employeeName);

    }
}
