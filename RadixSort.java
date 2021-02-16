public class RadixSort {

    public void sort(int[] arreglo, int radix) {
        // Determina el valor maximo y el minimo
        int ValorMinimo = arreglo[0];
        int ValorMaximo = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < ValorMinimo) {
                ValorMinimo = arreglo[i];
            } else if (arreglo[i] > ValorMaximo) {
                ValorMaximo = arreglo[i];
            }
        }
        int exponente = 1;
        while ((ValorMaximo - ValorMinimo) / exponente >= 1) {
            RadixSort.SortDigitos(arreglo, radix, exponente, ValorMinimo);
            exponente *= radix;
        }
    }

    private static void SortDigitos(int[] arreglo, int radix, int exponente, int ValorMinimo) {
        int Index;
        int[] temp = new int[radix];
        int[] resultado = new int[arreglo.length];

        // Initialize bucket
        for (int i = 0; i < radix; i++) {
            temp[i] = 0;
        }

        for (int i = 0; i < arreglo.length; i++) {
            Index = (int)(((arreglo[i] - ValorMinimo) / exponente) % radix);
            temp[Index]++;
        }

        for (int i = 1; i < radix; i++) {
            temp[i] += temp[i - 1];
        }

        for (int i = arreglo.length - 1; i >= 0; i--) {
            Index = (int)(((arreglo[i] - ValorMinimo) / exponente) % radix);
            resultado[--temp[Index]] = arreglo[i];
        }

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = resultado[i];
        }
    }
}