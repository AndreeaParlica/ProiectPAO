package utils;
import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.io.FileReader;
public class CSV {
    //methoda asta va citit dintr-un cdv file si va returna o lista
    public static List<String[]> readCsv(String file) {
        List<String[]> data = new LinkedList<String[]>();
        String rand;
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((rand = br.readLine()) != null) {
                String[] inregistrariDate = rand.split(",");
                data.add(inregistrariDate);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fisier inexistent");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Fisierul nu s-a putut citi");
            e.printStackTrace();
        }
        return data;
    }
}