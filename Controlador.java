import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class Controlador {

    // Escribir en archivo
    private Scanner sc = new Scanner(System.in);
    private FileWriter fichero = null;
    private PrintWriter pw = null;

    // leer Archivo
    File archivo = null;
    FileReader fr = null;
    BufferedReader tempBr = null;
    BufferedReader br = null;

    // Otros
    private Random rand = new Random();
    private String nombreArchivo = "Numeros.txt";
    int[] numeros;

    // Algoritmos
    GnomeSort gnomeSort = new GnomeSort();
    MergeSort mergeSort = new MergeSort();
    QuickSort quickSort = new QuickSort();
    BubbleSort bubbleSort = new BubbleSort();

    Controlador() {

    }

    // Es el método principal
    // Muestra un menu en consola con las opciónes:
    // Generar archivo
    // Ordenar numeros (eligiendo el método con el que lo hará)
    // Ordenar colección ya ordenada
    public void menu() {

        Boolean ejecutar = true;

        while (ejecutar) {
            print("\n :: -------------- SORT -------------- ::");
            print("1) Generar numeros");
            print("2) Ordenar numeros");
            print("3) Salir");

            int opcion = sc.nextInt();

            if (opcion == 1) {
                // Generar una serie de numeros aleatorios
                print(":: GENERAR NUMEROS  :: ");
                generarNumerosAleatorios();
                guardarNumerosArchivo();
                print("[!] Numeros generados correctamente");

            } else if (opcion == 2) {
                // Ordenar array de numeros desordenados

                if (numeros == null) {
                    generarNumerosAleatorios();
                    guardarNumerosArchivo();
                }

                leerArchivoNumeros();

                print("\n :: ORDENAR NUMEROS::");
                print("1) Gnome sort");
                print("2) Merge sort");
                print("3) Quick sort");
                print("4) Radix sort");
                print("5) Otro sort");

                int opcionAlgoritmo = sc.nextInt();

                if (opcionAlgoritmo == 1) { // Gnome sort
                    printArray(numeros, "original");
                    numeros = gnomeSort.ordenar(numeros);
                    printArray(numeros, "ordenado");

                    guardarNumerosArchivo();

                    print("[OK] Se han ordenado los numeros con Gnome sort");

                } else if (opcionAlgoritmo == 2) { // merge sort
                    printArray(numeros, "original");
                    numeros = mergeSort.ordenar(numeros);
                    printArray(numeros, "ordenado");

                    guardarNumerosArchivo();

                    print("[OK] Se han ordenado los numeros con Merge sort");

                } else if (opcionAlgoritmo == 3) { // Quick sort
                    printArray(numeros, "original");
                    quickSort.ordenar(numeros);
                    printArray(numeros, "ordenado");

                    guardarNumerosArchivo();

                    print("[OK] Se han ordenado los numeros con Quick sort");

                } else if (opcionAlgoritmo == 4) { // Radix sort

                } else if (opcionAlgoritmo == 5) { // Bubble sort
                    printArray(numeros, "original");
                    bubbleSort.ordenar(numeros);
                    printArray(numeros, "ordenado");

                    guardarNumerosArchivo();

                    print("[OK] Se han ordenado los numeros con Bubble sort");

                }

            } else if (opcion == 3) {
                // Finalizar programa
                ejecutar = false;
                print("[OK] Saliendo...");

            } else {
                print("[!] Opcion no valida");
            }

        }

    }

    // Genera numeros aleatorios y los guarda en un array
    public void generarNumerosAleatorios() {

        int cantidadNumeros = rand.nextInt(10);
        numeros = new int[cantidadNumeros];

        for (int i = 0; i < cantidadNumeros; i++) {
            numeros[i] = rand.nextInt(1000);
        }

    }

    // Lee el archivo en la direccion indicada y guarda todos sus numeros en un
    // array
    public void leerArchivoNumeros() {

        try {

            archivo = new File(nombreArchivo);
            fr = new FileReader(archivo);
            tempBr = new BufferedReader(fr);
            br = new BufferedReader(fr);

            // int cantidadLineas = 0;
            // while ((tempBr.readLine()) != null) {
            // cantidadLineas++;
            // }
            // numeros = new int[cantidadLineas];

            // Lectura del fichero
            String linea;
            int n = 0;
            while ((linea = br.readLine()) != null) {
                numeros[n] = Integer.parseInt(linea);
                n += 1;
            }

        } catch (Exception e) {
            print("[!] Debe generar los numeros aleatorios primero");

        } finally {
            // Cerrar archivo
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }

    // Guarda los numeros de un array en un archivo de texto
    public void guardarNumerosArchivo() {

        try {
            fichero = new FileWriter(nombreArchivo);
            pw = new PrintWriter(fichero);

            for (int i = 0; i < numeros.length; i++) {
                pw.println(numeros[i]);
            }

        } catch (Exception e) {
            print("[!] No se lograron guardar los numeros en el archivo");

        } finally {
            // Cerramos el archivo de texto
            try {
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }

    // Imprime un mensaje en consola
    public void print(String mensaje) {
        System.out.println(mensaje);
    }

    // Imprime un array en pantalla
    public void printArray(int arr[], String txt) {
        try {
            int n = arr.length;
            System.out.print("[-] Array " + txt + " : ");
            for (int i = 0; i < n; ++i)
                System.out.print(arr[i] + " - ");
            System.out.println();
        } catch (Exception e) {
            System.out.println("[!] Genere los numeros aleatorios primero");
        }

    }

}
