## Estructura de datos
## Luis Quan
## 201927151
# Parcial 2

El proyecto está diseñado para demostrar el uso de una lista enlazada para almacenar, manipular y mostrar los datos de un DPI (Documento Personal de Identificación). La estructura de datos utilizada es una lista enlazada simple.

## Cómo ejecutar el código

Para ejecutar este proyecto, sigue los siguientes pasos:

1. Asegúrate de tener **Java 8 o superior** instalado en tu sistema. Si no lo tienes, descárgalo desde [aquí](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

2. Clona este repositorio en tu máquina local utilizando Git:
   ```bash
   git clone https://github.com/primoquan/Estructura_Parcial2

3. Navega a la carpeta del proyecto y compílalo usando el siguiente comando:
   ```bash
   cd Estructura_Parcial2
    javac -d bin -sourcepath src src/Node.java src/LinkedList.java Main.java
   ```

4. Para ejecutar el programa, usa el siguiente comando:
   ```bash
   java Main
   ```

---

## Propósito de cada clase y método

### Clase `Node`
- Con esta clase lo que vamos a hacer es almacenar el valor en un nodo, y el siguiente lo iniciamos como nulo para poder almacenarle valor.
  ## Metodo
    - `dato` va a contener el valor numérico del nodo.
    - `siguiente` es la referencia del siguiente nodo en la lista.

### Clase `LinkedList`
- Con esta clase vamos a trabajar la lista en lazada y sus métodos para poder operarla
  ## Metodo
    - Agregamos un nodo al final de la lista, si esta vacía se iría al principio, con `agregar` .
    - Agregamos un nodo al principio de la lista, con `agregarAlInicio`.
    - Insertamos un nodo en una posición especifica de la lista, esta se la decimos donde queremos agregar, con `agregarEnMedio`.
    - Con este vamos a eliminar un nodo en una posición especifica, con `eliminarEn`. 
    - Buscamos si un valor está dentro de la lista, recorre todos los nodos y nos muestra True si está el valor o False si no, con `contiene`. 
    - Este nos imprime la lista para poderla ver, siempre que lo llamemos imprime la lista como este en ese momento, con `imprimirLista`. 
    - Este nos invierte el orden de la lista empezando por el ultimo y terminando con el primero, con `revertir`

### Clase `Main`
- Aquí vamos a ejecutar las instrucciones del grupo 2, al tener carnet impar 20192751.
- Para evitar que imprima de una vez adicionamos un try con thread.sleep para darle una pausa a cada parte de la ejecución.
- Realizamos las operaciones de agregar al principio, agregar en medio, agregar, remover, revisar si esta e invertir lista.

---

## Ejemplos de entradas y salidas

### Entrada:
Con mi **DPI** (número de identificación personal) ese ingresa en una cadena de números:  `"1638538510101"`.

### Operaciones:

1. Agregar el número 1 al inicio de la lista

2. Agregar el número 3 al final de la lista

3. Agregar el número 5 al medio de la lista (en la posición 1) visualmente seria posición 2

4. Mostrar la lista actual

5. Remover el número 3 de la lista

6. Mostrar la lista después de la eliminación

7. Agregar el número 7 al final de la lista

8. Verificar si el número 5 está en la lista (Método contains)

9. Verificar si el número 9 está en la lista (Método contains)

10. Revertir la lista (Método reverse)

11. Mostrar la lista después de revertir

12. Agregar el número 9 al inicio de la lista

13. Mostrar la lista final

### Salida:
Para la entrada `1638538510101`, el programa muestra la lista después de cada operación, con un tiempo de espera de 1 segundo entre cada operación, esto se hace para que no imprima todo de una vez. 

**Salida ejemplo**:

Generando lista con el DPI

Lista inicial del DPI:

1 -> 6 -> 3 -> 8 -> 5 -> 3 -> 8 -> 5 -> 1 -> 0 -> 1 -> 0 -> 1

1. Agregar número 1 al inicio
2. Agregar número 3 al final
3. Agregar número 5 en la posición 1
4. Mostrar lista actual:
   1 -> 5 -> 1 -> 6 -> 3 -> 8 -> 5 -> 3 -> 8 -> 5 -> 1 -> 0 -> 1 -> 0 -> 1 -> 3
5. Remover el número 3 que agregamos
6. Lista después de la eliminación:
   1 -> 5 -> 1 -> 6 -> 3 -> 8 -> 5 -> 3 -> 8 -> 5 -> 1 -> 0 -> 1 -> 0 -> 1
7. Agregar número 7 al final
8. ¿Contiene el número 5?
   Resultado: true
9. ¿Contiene el número 9?
   Resultado: false
10. Revertir la lista
11. Lista después de revertir:
    7 -> 1 -> 0 -> 1 -> 0 -> 1 -> 5 -> 8 -> 3 -> 5 -> 8 -> 3 -> 6 -> 1 -> 5 -> 1
12. Agregar número 9 al inicio
13. Lista final:
    9 -> 7 -> 1 -> 0 -> 1 -> 0 -> 1 -> 5 -> 8 -> 3 -> 5 -> 8 -> 3 -> 6 -> 1 -> 5 -> 1

---
## Gracias