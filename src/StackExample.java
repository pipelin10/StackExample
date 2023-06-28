import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        // Crear una instancia de Stack utilizando la interfaz Collection
        Stack<String> stack = new Stack<>();

        // Agregar elementos al Stack
        stack.push("Manzana");
        stack.push("Naranja");
        stack.push("Plátano");

        // Imprimir el contenido del Stack
        System.out.println("Contenido del Stack: " + stack);

        // Obtener y eliminar el elemento en la cima del Stack
        String elementoSuperior = stack.pop();
        System.out.println("Elemento superior: " + elementoSuperior);

        // Imprimir el contenido del Stack después de la eliminación
        System.out.println("Contenido del Stack después de la eliminación: " + stack);

        // Obtener el elemento en la cima del Stack sin eliminarlo
        String elementoEnCima = stack.peek();
        System.out.println("Elemento en la cima: " + elementoEnCima);
        System.out.println("Contenido del Stack después de peek: " + stack);

        // Verificar si el Stack está vacío
        boolean estaVacio = stack.isEmpty();
        System.out.println("¿El Stack está vacío? " + estaVacio);

        // Obtener el tamaño del Stack
        int tamaño = stack.size();
        System.out.println("Tamaño del Stack: " + tamaño);
    }
}