package n1exercici4;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Directorio {
    public static void main(String[] args) {
        mostrarContenidoArchivo();
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

    private static void mostrarContenidoArchivo() {
        try (BufferedReader reader = new BufferedReader(new FileReader("salida.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

