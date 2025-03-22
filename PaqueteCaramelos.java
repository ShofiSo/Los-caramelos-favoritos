import java.util.Stack;

public class PaqueteCaramelos {

    private Stack<String> pilaCaramelos;  

    public PaqueteCaramelos(String[] caramelos) {
        pilaCaramelos = new Stack<>();
        for (String caramelo : caramelos) {
            pilaCaramelos.push(caramelo);  
        }
    }

    public void procesarCaramelos() {
        Stack<String> caramelosDevueltos = new Stack<>();  // Pila para los caramelos no amarillos

        System.out.println("Iniciando proceso...");

        while (!pilaCaramelos.isEmpty()) {
            String caramelo = pilaCaramelos.pop();  // Sacamos un caramelo de la pila

            System.out.println("Sacando caramelo: " + caramelo);

            if ("amarillo".equals(caramelo)) {
                System.out.println("¡Comiendo caramelo " + caramelo + "!");
            } else {
                System.out.println("Devolviendo caramelo " + caramelo + " al paquete.");
                caramelosDevueltos.push(caramelo);  // Si no es amarillo, lo devolvemos a la pila de caramelos
            }
        }
        while (!caramelosDevueltos.isEmpty()) {
            String caramelo = caramelosDevueltos.pop();
            pilaCaramelos.push(caramelo);  // Los devolvemos al paquete
        }

        System.out.println("\nCaramelos restantes en el paquete: " + pilaCaramelos);
    }

    public static void main(String[] args) {
        String[] caramelos = {"rojo", "amarillo", "verde", "amarillo", "azul", "amarillo", "rojo"};
        PaqueteCaramelos paquete = new PaqueteCaramelos(caramelos);


        paquete.procesarCaramelos();
    }
}
