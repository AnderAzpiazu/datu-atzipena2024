package paagbi;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtener la ruta base del directorio de trabajo actual
        String rutaBase = System.getProperty("user.dir") + "/src/main/java/paagbi";

        // Definir las rutas de las carpetas relativas
        String[] carpetas = {
            rutaBase + "/karpeta_berriak",
            rutaBase + "/karpeta_berriak/animaliak",
            rutaBase + "/karpeta_berriak/animaliak/arrainak",
            rutaBase + "/karpeta_berriak/animaliak/ugaztunak",
            rutaBase + "/karpeta_berriak/elikagaiak",
            rutaBase + "/karpeta_berriak/elikagaiak/esnekiak",
            rutaBase + "/karpeta_berriak/elikagaiak/barazkiak"
        };

        // Mostrar las opciones de carpetas
        System.out.println("Seleccione una carpeta para crear:");
        for (int i = 0; i < carpetas.length; i++) {
            System.out.println((i + 1) + ". " + carpetas[i]);
        }

        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        if (opcion < 1 || opcion > carpetas.length) {
            System.out.println("Opción no válida");
            return;
        }

        String rutaCarpeta = carpetas[opcion - 1];

        // Crear la carpeta si no existe
        File carpeta = new File(rutaCarpeta);
        if (!carpeta.exists()) {
            if (carpeta.mkdirs()) {
                System.out.println("Carpeta creada: " + rutaCarpeta);
            } else {
                System.out.println("Error al crear la carpeta: " + rutaCarpeta);
                return;
            }
        } else {
            System.out.println("La carpeta ya existe: " + rutaCarpeta);
        }

        // Solicitar el nombre del archivo
        System.out.println("Ingrese el nombre del archivo (sin extensión .txt):");
        String nombreArchivo = scanner.nextLine();

        File archivo = new File(rutaCarpeta + "/" + nombreArchivo + ".txt");

        // Solicitar el texto a escribir en el archivo
        System.out.println("Ingrese el texto que desea escribir en el archivo:");
        String contenido = scanner.nextLine();

        // Intentar crear el archivo y escribir el contenido
        try {
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getPath());

                // Escribir el texto ingresado por el usuario en el archivo
                try (FileWriter writer = new FileWriter(archivo)) {
                    writer.write(contenido);
                    System.out.println("Texto escrito en el archivo.");
                }
            } else {
                System.out.println("El archivo ya existe: " + archivo.getPath());
            }
        } catch (IOException e) {
            System.out.println("Error al crear o escribir en el archivo: " + e.getMessage());
        }

        scanner.close();
    }
}
