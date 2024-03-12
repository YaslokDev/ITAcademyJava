package n1exercici2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Directorio {
    public static void main(String[] args) {

        mostrarDirectorio("C:\\Users\\Yaslok\\Desktop\\Yaslok\\S01T05");
    }

    public static void mostrarDirectorio(String path) {

        File directorio = new File(path);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        if(directorio.isDirectory()) {
            File[] archivos = directorio.listFiles();
            Arrays.sort(archivos);
            for (File archivo : archivos) {
                if (archivo.isDirectory()) {
                    System.out.println("D - " + archivo.getAbsolutePath() + " --- Última modificación: " + sdf.format(archivo.lastModified()));
                    mostrarDirectorio(archivo.getAbsolutePath());
                } else {
                    System.out.println("F - " + archivo.getAbsoluteFile() + " --- Última modificación: " + sdf.format(archivo.lastModified()));
                }
            }
        } else {
            System.out.println("La ruta especificada no es un directorio");
        }
    }
}
