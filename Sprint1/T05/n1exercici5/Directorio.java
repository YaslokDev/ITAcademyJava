package n1exercici5;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Directorio {
    public static void main(String[] args) {
        String directorioPath = "src/main/java/";
        String outputFile = "directorio.ser";

        mostrarDirectorio(directorioPath, outputFile);

        mostrarContenidoArchivo(outputFile);
    }

    public static void mostrarDirectorio(String path, String outputFile) {
        File directorio = new File(path);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(outputFile))) {
            oos.writeObject(directorio);
            mostrarDirectorioRecursivo(directorio, sdf, System.out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void mostrarDirectorioRecursivo(File directorio, SimpleDateFormat sdf, PrintStream out) {
        if (directorio.isDirectory()) {
            File[] archivos = directorio.listFiles();
            Arrays.sort(archivos);
            for (File archivo : archivos) {
                if (archivo.isDirectory()) {
                    out.println("D - " + archivo.getAbsolutePath() + " --- Última modificación: " + sdf.format(archivo.lastModified()));
                    mostrarDirectorioRecursivo(archivo, sdf, out);
                } else {
                    out.println("F - " + archivo.getAbsoluteFile() + " --- Última modificación: " + sdf.format(archivo.lastModified()));
                }
            }
        } else {
            out.println("La ruta especificada no es un directorio");
        }
    }

    private static void mostrarContenidoArchivo(String outputFile) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(outputFile))) {
            File directorio = (File) ois.readObject();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            mostrarDirectorioRecursivo(directorio, sdf, System.out);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
