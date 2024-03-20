package classes;
public class InsertionSort {
	
    public int[] insertionSort(int[] array) {
    	int troca = 0;
        int comparacoes = 0;
    	long startTime = System.nanoTime();
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
                troca++;
                comparacoes++;
            }
            array[j + 1] = key;
            if (j >= 0) {
                comparacoes++;
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

