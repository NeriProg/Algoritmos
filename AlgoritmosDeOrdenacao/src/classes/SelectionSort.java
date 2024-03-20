package classes;

public class SelectionSort {
    int troca = 0;
    int comparacoes = 0;
    public int[] selectionSort(int[] array) {
        long startTime = System.nanoTime();
        for (int i = 0; i < array.length - 1; i++) {
            int indice_minimo = i;
            for (int j = i + 1; j < array.length; j++) {
                this.comparacoes++;
                if (array[j] < array[indice_minimo]) {
                    indice_minimo = j;
                }
            }
            int temp = array[indice_minimo];
            array[indice_minimo] = array[i];
            array[i] = temp;
            this.troca++;
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime); 
       
        
        System.out.println("Tempo de execução: " + duration + " nanossegundos");        
        System.out.println("Número de trocas: "+ troca);
        System.out.println("Número de comparações: "+ comparacoes);

        return array;
    }
}
