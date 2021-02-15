public class MergeSort {

   
    public int[] ordenar(int[] numeros) {

        // Ver si el array esta ordenado (solo queda un elemento)
        if (numeros.length <= 1) {
            return numeros;
        }

        // Indica donde esta la midad del array
        int middle = numeros.length / 2;
        int[] prev = new int[middle];
        int[] next;

        // mira si su mitar derecha (next) es par o impar
        if (numeros.length % 2 == 0) {
            next = new int[middle];
        } else {
            next = new int[middle + 1];
        }

        // Ordena cada midad del array original
        for (int i = 0; i < middle; i++) {
            prev[i] = numeros[i];
        }

        for (int j = 0; j < next.length; j++) {
            next[j] = numeros[middle + j];
        }

        // Guarda el array ordenado en un nuevo array
        int[] resultado = new int[numeros.length];

        // Ordenar ambas mitades del array
        prev = ordenar(prev);
        next = ordenar(next);

        // Mezclar las mitades ordenadas
        resultado = merge(prev, next);

        return resultado;

    }

    // Mezcla las dos mitades ordenadas de un array
    private int[] merge(int[] prev, int[] next) {

        // Array con ambas partes unidas
        int[] resultado = new int[prev.length + next.length];

        int prevIndex, nextIndex, resultadoIndex;
        prevIndex = nextIndex = resultadoIndex = 0;

        // Compara ambos arrays y los mezcla de forma ordenada
        while (prevIndex < prev.length || nextIndex < next.length) {
            if (prevIndex < prev.length && nextIndex < next.length) {
                if (prev[prevIndex] < next[nextIndex]) {
                    resultado[resultadoIndex++] = prev[prevIndex++];
                } else {
                    resultado[resultadoIndex++] = next[prevIndex++];
                }
            } else if (prevIndex < prev.length) {
                resultado[resultadoIndex++] = prev[prevIndex++];
            } else if (nextIndex < next.length) {
                resultado[resultadoIndex++] = next[nextIndex++];

            }
        }

        return resultado;

    }

}
