//Estructura de Datos
//Parcial #2
//Luis Quan
//201927151

package src;

// Con esta clase vamos a trabajar la lista en lazada y sus metodos para poder operarla
public class LinkedList {
    private Node primero;


    // Agregamos un nodo al final de la lista, si esta vacia se iria al principio.

    public void agregar(int dato) {
        Node nuevoNodo = new Node(dato);
        if (primero == null) {
            primero = nuevoNodo;
            return;
        }
        Node actual = primero;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = nuevoNodo;
    }


    //Agrega un nodo al principio de la lista

    public void agregarAlInicio(int dato) {
        Node nuevoNodo = new Node(dato);
        nuevoNodo.siguiente = primero;
        primero = nuevoNodo;
    }


    //Insertamos un nodo en una posicion especifica de la lista, esta se la decimos donde queremos agregar, ejemplo si le ponemos 0 lo agrega al principo de la lista

    public void agregarEnMedio(int dato, int posicion) {
        if (posicion <= 0) {
            agregarAlInicio(dato);
            return;
        }

        Node nuevoNodo = new Node(dato);
        Node actual = primero;
        int indice = 0;

        while (actual != null && indice < posicion - 1) {
            actual = actual.siguiente;
            indice++;
        }

        if (actual == null) {
            agregar(dato);
        } else {
            nuevoNodo.siguiente = actual.siguiente;
            actual.siguiente = nuevoNodo;
        }
    }

    // Con este vamos a eliminar un nodo en una posicion especifica, a este le decimos que posicion queremos eliminar


    public void eliminarEn(int indice) {
        if (primero == null) return; // Lista vacía

        if (indice == 0) {
            primero = primero.siguiente; // Si es el primer nodo, lo eliminamos
            return;
        }

        Node actual = primero;
        int indiceActual = 0;

        // Buscar el nodo en la posición indicada
        while (actual != null && indiceActual < indice - 1) {
            actual = actual.siguiente;
            indiceActual++;
        }

        if (actual != null && actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente;
        }
    }


    //Buscamos si un valor esta dentro de la lista, recorre todos los nodos y nos muestra True si esta el valor o False si no

    public boolean contiene(int valor) {
        Node actual = primero;
        while (actual != null) {
            if (actual.dato == valor) return true;
            actual = actual.siguiente;
        }
        return false;
    }



    //Este nos imprime la lista seprando cada nodo con una flecha , siempre que lo llamemos imprime la lista como este en ese momento

    public void imprimirLista() {
        Node actual = primero;
        while (actual != null) {
            System.out.print(actual.dato);
            if (actual.siguiente != null) {
                System.out.print(" -> ");
            }
            actual = actual.siguiente;
        }
        System.out.println(); // Dejamos una linea de por medio para ordenar visutalmente
    }


    //Este nos invierte el orden de la lista empezando por el ultimo y terminando con el primero
    //Utiliza tres referencias: una para el nodo anterior, una para el nodo actual y una para el siguiente nodo.

    public void revertir() {
        Node anterior = null;
        Node actual = primero;
        while (actual != null) {
            Node siguienteTemporal = actual.siguiente;
            actual.siguiente = anterior;
            anterior = actual;
            actual = siguienteTemporal;
        }
        primero = anterior;
    }
}
