public class QuickSort {

    public int[] ordenar(int[] numeros) {
        quicksort(numeros, 0, numeros.length - 1);
        return numeros;
    }

    public void quicksort(int[] vect, int izq, int der) {
        int d, pivote, aux;
        if (izq >= der) {
            return;
        }

        d = der;

        pivote = izq;
        while (izq != der) {
            while (vect[der] >= vect[pivote] && izq < der)
                der--;

            if (der != izq) {
                aux = vect[der];
                vect[der] = vect[izq];
                vect[izq] = aux;
            }
        }
        if (izq == der) {

            quicksort(vect, izq + 1, d);
        }

    }

}
