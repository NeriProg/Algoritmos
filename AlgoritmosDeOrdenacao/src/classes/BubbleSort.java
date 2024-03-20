package classes;

public class BubbleSort {
    public int[] bubbleSort(int[] array) {
        int troca=0;
        int comparacoes=0;
        
        long startTime = System.nanoTime();
        int n = array.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                comparacoes++;
                if (array[j] > array[j + 1]) {
                    troca++;
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        
        long endTime = System.nanoTime();
        long duration = (endTime - startTime); 
        
        System.out.println("Tempo de execução: " + duration + " nanossegundos");        
        System.out.println("Número de trocas: "+ troca);
        System.out.println("Número de comparações: "+ comparacoes);

        return array;
    }
}
