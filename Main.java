//Estructura de Datos
//Parcial #2
//Luis Quan
//201927151

import src.*;


//Este es nuestro programa principal donde mostramos el uso de la lista LinkedList

public class Main {
    public static void main(String[] args) {
        LinkedList listaDpi = new LinkedList();

        // Aqui colocamos nuestro numero de dpi
        String dpi = "1638538510101";

        System.out.println("Generando lista con el DPI");
        for (int i = 0; i < dpi.length(); i++) {
            int digito = Character.getNumericValue(dpi.charAt(i));
            listaDpi.agregar(digito);
        }



        //Aqui vamos a ejecutar las instrucciones del grupo 2, al tener carnet impar 20192751
        //Para evitar que imprima de una vez adicionamos un try con thread.sleep para darle una pausa a cada parte de la ejecucion
        //Realizamos las operaciones de agregar al principio, agregar en medio, agregar, remover, revisar si esta e invertir lista.

        System.out.println("Lista inicial del DPI:");
        listaDpi.imprimirLista();

        try {
            Thread.sleep(1000);  // Pausa de 1 segundo

            //Agregamos el número 1 al inicio de la lista usando el metodo agregarAlInicio(1).
            System.out.println("1. Agregar número 1 al inicio");
            listaDpi.agregarAlInicio(1);
            Thread.sleep(1000);

            //Después agregamos el número 3 al final usando el metodo agregar(3).
            System.out.println("2. Agregar número 3 al final");
            listaDpi.agregar(3);
            Thread.sleep(1000);

            //Agregamos el número 5 en la posición 1 con agregarEnMedio(5, 1). En este le damos el dato que vamos a ingresar y la posicion.
            System.out.println("3. Agregar número 5 en la posición 1");
            listaDpi.agregarEnMedio(5, 1);
            Thread.sleep(1000);

            //Aqui imprimimos la lista para ver como esta
            System.out.println("4. Mostrar lista actual:");
            listaDpi.imprimirLista();
            Thread.sleep(1000);

            //Usamos el metodo eliminarEn(15) para eliminar el número 3 que agregamos. Este número está en la posición 15.
            System.out.println("5. Remover el número 3 que agregamos");
            listaDpi.eliminarEn(15);  // Eliminamos el `3` que agregamos (posición 15 es el índice del último 3)
            Thread.sleep(1000);

            //Aqui imprimimos la lista para ver como esta
            System.out.println("6. Lista después de la eliminación:");
            listaDpi.imprimirLista();
            Thread.sleep(1000);

            //Untilizamos el metodo agregar(7) para agregar el numero 7 al final de la lista.
            System.out.println("7. Agregar número 7 al final");
            listaDpi.agregar(7);
            Thread.sleep(1000);

            //Verificamos si el número 5 está en la lista usando el metodo contiene(5) y mostramos el resultado
            System.out.println("8. ¿Contiene el número 5?");
            System.out.println("Resultado: " + listaDpi.contiene(5));
            Thread.sleep(1000);

            //Verificamos si el número 5 está en la lista usando el metodo contiene(9) y mostramos el resultado
            System.out.println("9. ¿Contiene el número 9?");
            System.out.println("Resultado: " + listaDpi.contiene(9));
            Thread.sleep(1000);

            //Finalmente, utilizamos el metodo revertir() para invertir la lista y mostrar cómo cambia el orden de los nodos.
            System.out.println("10. Revertir la lista");
            listaDpi.revertir();
            Thread.sleep(1000);

            //Imprimimos la lista despues de revertir
            System.out.println("11. Lista después de revertir:");
            listaDpi.imprimirLista();
            Thread.sleep(1000);

            //Agregamos con el metodo agregarAlInicio(9) para agregar el numero 9
            System.out.println("12. Agregar número 9 al inicio");
            listaDpi.agregarAlInicio(9);
            Thread.sleep(1000);

            //Imprimimos la lista para ver como quedo
            System.out.println("13. Lista final:");
            listaDpi.imprimirLista();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}