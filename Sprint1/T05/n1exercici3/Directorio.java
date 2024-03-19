package n1exercici3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Directorio {
    public static void main(String[] args) {
        mostrarDirectorio("src/main/java/", "salida.txt");
    }

    public static void mostrarDirectorio(String path, String outputFile) {
        File directorio = new File(path);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        try (PrintWriter writer = new PrintWriter(new FileWriter(outputFile, true))) {
            mostrarDirectorioRecursivo(directorio, sdf, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void mostrarDirectorioRecursivo(File directorio, SimpleDateFormat sdf, PrintWriter writer) {
        if (directorio.isDirectory()) {
            File[] archivos = directorio.listFiles();
            Arrays.sort(archivos);
            for (File archivo : archivos) {
                if (archivo.isDirectory()) {
                    writer.println("D - " + archivo.getAbsolutePath() + " --- Última modificación: " + sdf.format(archivo.lastModified()));
                    mostrarDirectorioRecursivo(archivo, sdf, writer);
                } else {
                    writer.println("F - " + archivo.getAbsoluteFile() + " --- Última modificación: " + sdf.format(archivo.lastModified()));
                }
            }
        } else {
            writer.println("La ruta especificada no es un directorio");
        }
    }
}

