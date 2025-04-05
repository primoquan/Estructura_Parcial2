//Estructura de Datos
//Parcial #2
//Luis Quan
//201927151

package src;

//Con esta clase lo que vamos a hacer es almacenar el valor en un nodo,
//y el siguiente lo iniciamos como nulo para poder almacenarle valor
//data va a contener el valor numerico del nodo
//next es la referencia del siguiente nodo en la lista

public class Node {
    int dato;
    Node siguiente;

    public Node(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
