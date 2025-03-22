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
        Stack<String> caramelosDevueltos = new Stack<>(); 

        while (!pilaCaramelos.isEmpty()) {
            String caramelo = pilaCaramelos.pop();  

            if ("amarillo".equals(caramelo)) {
                System.out.println("Comiendo caramelo " + caramelo);
            } else {
                caramelosDevueltos.push(caramelo);  
            }
        }
        while (!caramelosDevueltos.isEmpty()) {
            String caramelo = caramelosDevueltos.pop();
            pilaCaramelos.push(caramelo);  // Acá devolvemos los caramelos al paquete
        }

        System.out.println("Caramelos restantes en el paquete: " + pilaCaramelos);
    }
    public static void main(String[] args) {
        String[] caramelos = {"Rojo", "Amarillo", "Verde", "Amarillo", "Azul", "amarillo", "rojo"};
        PaqueteCaramelos paquete = new PaqueteCaramelos(caramelos);

        paquete.procesarCaramelos();
    }
}