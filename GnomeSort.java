
public class GnomeSort {

    public int[] ordenar(int[] numeros) {

        int i = 1;
        while (i < numeros.length) {
            int nextNumero = numeros[i];
            int prevNumero = numeros[i - 1];

            if (nextNumero >= prevNumero) {
                i++;
            } else {
                numeros[i] = prevNumero;
                numeros[i - 1] = nextNumero;
                i--;
            }
        }

        return numeros;
    }

}
