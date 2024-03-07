package n1exercici3;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> paisesMap = new HashMap<String, String>();
        String path = System.getProperty("user.dir") + "\\src\\countries.txt";
        try {
            File f = new File(path);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            Scanner scanner = new Scanner(f);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] splitLine = line.split(" ");
                paisesMap.put(splitLine[0].trim(), splitLine[1].trim());
            }
            scanner.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre de usuario: ");
        String usuario = sc.nextLine();

        int puntuacion = 0;
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            List<String> paisesList = new ArrayList<>(paisesMap.keySet());
            String paisAleatorio = paisesList.get(random.nextInt(paisesList.size()));
            String capital = paisesMap.get(paisAleatorio);
            System.out.print("Cual es la capital de " + paisAleatorio + ": ");
            String respuesta = sc.nextLine();

            if (respuesta.equalsIgnoreCase(capital)){
                puntuacion++;
            }
        }
        try{
            PrintWriter pr = new PrintWriter(new FileWriter(System.getProperty("user.dir") + "\\src\\classificacio.txt", true));
            pr.println(usuario + " : " + puntuacion);
            pr.flush();
            pr.close();
        } catch (IOException e) {
            System.out.println("Error al escribir el fichero classificacio.txt");
        }
    }
}
