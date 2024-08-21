package classes;

public class BubbleSortController {

    public static void bubbleSort(int[] lista){
        for (int i = 0; i < lista.length; i++){
            for (int j = 0; j < lista.length - 1; j++){
                if (lista[j] > lista[j + 1]){
                    swap(lista, j, j+1);
                }
            }
        }
    }

    public static void swap(int[] lista, int i, int j){
        int aux = lista[i];
        lista[i] = lista[j];
        lista[j] = aux;
    }
}
