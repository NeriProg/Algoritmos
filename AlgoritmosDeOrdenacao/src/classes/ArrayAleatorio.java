package classes;

public class ArrayAleatorio {
    public static void arrayAleatorio(int[] array, int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            array[i] = (int)(Math.random() * 1000);
        }
    }
}

