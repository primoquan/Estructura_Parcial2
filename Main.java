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
        String dpi = "1638538510101"; // Reemplaza esto con el número de DPI

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

            System.out.println("1. Agregar número 1 al inicio");
            listaDpi.agregarAlInicio(1);
            Thread.sleep(1000);

            System.out.println("2. Agregar número 3 al final");
            listaDpi.agregar(3);
            Thread.sleep(1000);

            System.out.println("3. Agregar número 5 en la posición 1");
            listaDpi.agregarEnMedio(5, 1);
            Thread.sleep(1000);

            System.out.println("4. Mostrar lista actual:");
            listaDpi.imprimirLista();
            Thread.sleep(1000);

            System.out.println("5. Remover el número 3 que agregamos");
            listaDpi.eliminarEn(15);  // Eliminamos el `3` que agregamos (posición 15 es el índice del último 3)
            Thread.sleep(1000);

            System.out.println("6. Lista después de la eliminación:");
            listaDpi.imprimirLista();
            Thread.sleep(1000);

            System.out.println("7. Agregar número 7 al final");
            listaDpi.agregar(7);
            Thread.sleep(1000);

            System.out.println("8. ¿Contiene el número 5?");
            System.out.println("Resultado: " + listaDpi.contiene(5));
            Thread.sleep(1000);

            System.out.println("9. ¿Contiene el número 9?");
            System.out.println("Resultado: " + listaDpi.contiene(9));
            Thread.sleep(1000);

            System.out.println("10. Revertir la lista");
            listaDpi.revertir();
            Thread.sleep(1000);

            System.out.println("11. Lista después de revertir:");
            listaDpi.imprimirLista();
            Thread.sleep(1000);

            System.out.println("12. Agregar número 9 al inicio");
            listaDpi.agregarAlInicio(9);
            Thread.sleep(1000);

            System.out.println("13. Lista final:");
            listaDpi.imprimirLista();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}