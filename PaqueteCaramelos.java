import java.util.Stack;

public class PaqueteCaramelos {

    private Stack<String> pilaCaramelos; 

    public PaqueteCaramelos(String[] caramelos) {
        pilaCaramelos = new Stack<>();
        for (String caramelo : caramelos) {
            pilaCaramelos.push(caramelo); 
        }
    }
