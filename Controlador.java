import java.util.ArrayList;
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
    BufferedReader br = null;

    // Otros
    private Random rand = new Random();
    private String nombreArchivo = "Numeros.txt";
    ArrayList<Integer> numeros = new ArrayList<>();

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
            print("3) Ordenar coleccion ya ordenada");
            print("4) Salir");

            int opcion = sc.nextInt();

            if (opcion == 1) {

                print(":: GENERAR NUMEROS  :: ");
                guardarNumerosAleatorios();
                print("[!] Numeros generados correctamente");

            } else if (opcion == 2) {

            } else if (opcion == 3) {

            } else if (opcion == 4) {
                ejecutar = false;
                print("[OK] Saliendo...");
            } else {
                print("[!] Opcion no valida");
            }

        }

    }

    // Genera y guarda numeros aleatorios en un archivo de texto
    public void guardarNumerosAleatorios() {

        int cantidadNumeros = rand.nextInt(3000);
        int numeroRandom = 0;

        try {
            fichero = new FileWriter(nombreArchivo);
            pw = new PrintWriter(fichero);

            for (int i = 0; i < cantidadNumeros; i++) {
                numeroRandom = rand.nextInt(1000);
                pw.println(numeroRandom);
            }

        } catch (Exception e) {
            e.printStackTrace();

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

    // Lee el archivo en la direccion indicada y guarda todos sus numeros en un
    // arreglo
    public ArrayList<Integer> leerArchivoNumeros(String dirrecion) {

        try {

            archivo = new File(nombreArchivo);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while ((linea = br.readLine()) != null) {
                numeros.add(Integer.parseInt(linea));
            }

        } catch (Exception e) {
            e.printStackTrace();

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

        return numeros;
    }



    // OPCIONAL - guardar el tiempo que tardo en ordenarse los datos en un arhivo de
    // texto
    // Guarda el mensaje indicado en una nueva linea de un archivo de texto
    public void guardarTiempoOrdenamiento(String mensaje) {

    }

    // Imprime un mensaje en consola
    public void print(String mensaje) {
        System.out.println(mensaje);
    }

}
