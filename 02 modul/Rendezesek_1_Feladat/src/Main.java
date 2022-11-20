import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //Írjon egy programot ami az aktuális könyvtárban lévő bemenet.txt fájlból felölt egy karakterlánc
        //tömböt. A fájl első sorában a későbbi sorok száma van, utána soronként egy-egy karakterlánc.
        //a. Rendezze a tömböt buborék rendezéssel.
        //b. Rendezze a tömböt kiválasztásos rendezéssel.
        //c. Rendezze a tömböt beszúrásos rendezéssel.
        //A rendezést a karakterláncok első betűje alapján végezze el.
        System.out.println(" Ez a program egy fajlbol beolvas egy karakterlancot !");
        // folder letrehozasa
        Path mappa_eleresi_utvonala = Paths.get("", "_DataFiles").toAbsolutePath();
        String uj_mappa_eleresi_utvonala = mappa_eleresi_utvonala + "/";
        File mappa = mappa_eleresi_utvonala.toFile();
        String fajlok = "";
        Scanner sc = new Scanner(System.in);
        System.out.println(" Kerem adja meg az elkeszitendo fajl nevet : ");
        fajlok = sc.nextLine();
        Path newDirectory = Files.createDirectories(Path.of(uj_mappa_eleresi_utvonala));
        System.out.println("uj mappa = " + newDirectory);

        Path newFile = Files.createDirectories(newDirectory.resolve(newDirectory+"/"+fajlok+"/"));
        System.out.println("newFile = " + newFile);
        Path ujFajlUtja = Paths.get("_DataFiles",fajlok,fajlok+".txt");
        File ujFajl = ujFajlUtja.toFile();
        FileWriter fw = new FileWriter(ujFajl);
        fw.write("6");
        fw.write("\n");
        fw.write("Alma");
        fw.write("\n");
        fw.write("Korte");
        fw.write("\n");
        fw.write("Szilva");
        fw.write("\n");
        fw.write("Eper");
        fw.write("\n");
        fw.write("Narancs");
        fw.write("\n");
        fw.write("Szolo");


        fw.close();


        FileReader fr = new FileReader(ujFajl);
        Scanner scFileOlvaso = new Scanner(fr);
        String elsoSor = scFileOlvaso.nextLine();
        System.out.println(elsoSor);
        String [] tomb = new String[Integer.parseInt(elsoSor)];
        for (int i=0;i<Integer.parseInt(elsoSor);i++){
            tomb[i]=scFileOlvaso.nextLine();
            System.out.println(tomb[i]);
        }
        fr.close();
    }
}