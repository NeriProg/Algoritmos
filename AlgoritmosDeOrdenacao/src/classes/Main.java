package classes;

import java.util.Arrays; // Adicione esta linha

public class Main {
    public static void main(String[] args) {
        int tamanho = 10;
        int[] array = new int[tamanho];

        InsertionSort insertionSort = new InsertionSort();
        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();

        System.out.println("Para array de tamanho 10");
        System.out.println("");
        ArrayAleatorio.arrayAleatorio(array, tamanho);
         
        System.out.println("");
        System.out.println("Insertion Sort: ");
        ArrayAleatorio.arrayAleatorio(array, tamanho);
        array = insertionSort.insertionSort(array);
        System.out.println("Array Ordenado: " + Arrays.toString(array));
 
        System.out.println("");
        System.out.println("Bubble Sort: ");
        ArrayAleatorio.arrayAleatorio(array, tamanho);
        array = bubbleSort.bubbleSort(array);
        System.out.println("Array Ordenado: " + Arrays.toString(array));
 
        System.out.println("");
        System.out.println("Selection Sort: ");
        ArrayAleatorio.arrayAleatorio(array, tamanho);
        array = selectionSort.selectionSort(array);
        System.out.println("Array Ordenado: " + Arrays.toString(array));
 
        System.out.println("");
        System.out.println("===================================================================================================================================");
        System.out.println("");
        
        int tamanho1 = 100;
        int[] array1 = new int[tamanho1];
        
        System.out.println("Para array de tamanho 100");
        System.out.println("");
        ArrayAleatorio.arrayAleatorio(array1, tamanho1);
         
        System.out.println("");
        System.out.println("Insertion Sort: ");
        ArrayAleatorio.arrayAleatorio(array1, tamanho1);
        array1 = insertionSort.insertionSort(array1);
        System.out.println("Array Ordenado: " + Arrays.toString(array1));
 
        System.out.println("");
        System.out.println("Bubble Sort: ");
        ArrayAleatorio.arrayAleatorio(array1, tamanho1);
        array1 = bubbleSort.bubbleSort(array1);
        System.out.println("Array Ordenado: " + Arrays.toString(array1));
 
        System.out.println("");
        System.out.println("Selection Sort: ");
        ArrayAleatorio.arrayAleatorio(array1, tamanho1);
        array1 = selectionSort.selectionSort(array1);
        System.out.println("Array Ordenado: " + Arrays.toString(array1));
    }
}
