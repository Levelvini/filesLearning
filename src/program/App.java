package program;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        File file = new File("\"C:\\Users\\Level_vini\\Downloads\\carta de solicitacao LCGH EDSON NEVES.docx\"");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("error : RuntimeException!!");
        }
        finally {
            if (sc != null){
                sc.close();
            }
        }
    }
}

