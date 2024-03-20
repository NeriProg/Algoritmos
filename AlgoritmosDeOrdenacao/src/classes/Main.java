package classes;

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
 
        System.out.println("");
        System.out.println("Insertion Sort: ");
        array = insertionSort.insertionSort(array);
 
        System.out.println("");
        System.out.println("Bubble Sort: ");
        array = bubbleSort.bubbleSort(array);
 
        System.out.println("");
        System.out.println("Selection Sort: ");
        array = selectionSort.selectionSort(array);
 
        System.out.println("");
        System.out.println("===================================================================================================================================");
        System.out.println("");
        
       
    }
}



