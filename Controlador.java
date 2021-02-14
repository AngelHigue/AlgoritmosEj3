import java.util.Scanner;

public class Controlador {


    Scanner sc = new Scanner(System.in);
    
    Controlador(){

    }

    // Es el método principal
    // Muestra un menu en consola con las opciónes:
    // Generar archivo
    // Ordenar numeros (eligiendo el método con el que lo hará)
    // Ordenar colección ya ordenada
    public void menu(){

        Boolean ejecutar = true;


        while(ejecutar){
            print("\n :: SORT ::");
            print("1) Generar numeros");
            print("2) Ordenar numeros");
            print("3) Ordenar coleccion ya ordenada");
            print("4) Salir");

            int opcion = sc.nextInt();


            if(opcion == 1){

            }else if(opcion == 2){

            }else if(opcion == 3){
                
            }else if(opcion == 4){
                ejecutar = false;
                print("[OK] Saliendo...");
            }else{
                print("[!] Opcion no valida");
            }

        }

    }

    // Imprime un mensaje en consola
    public void print(String mensaje){
        System.out.println(mensaje);
    }


    // Genera y guarda numeros aleatorios en un archivo de texto
    public void guardarNumerosAleatorios(){

    }


    // Lee el archivo en la direccion indicada y guarda todos sus numeros en un arreglo
    public int[] leerArchivoNumeros(String dirrecion){
        return null;
    }

    // OPCIONAL - guardar el tiempo que tardo en ordenarse los datos en un arhivo de texto
    // Guarda el mensaje indicado en una nueva linea de un archivo de texto
    public void guardarTiempoOrdenamiento(String mensaje){

    }


    // MÉTOS IMPLEMENTANDO LOS ALGORITMOS DE ORDENAMIENTO
    // ...
    


}

