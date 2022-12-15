import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //Írjon programot, ami a prancssori argumentumként kapott fájlból felolvas egy labirintust. A
        //labirintus egy kétdimenziós karaktertömbben tárolható. A fájl első sorában két szám szerepel
        //szóközzel elválasztva, ami a labirintus méretét adja meg (sorok és oszlopok száma). Ez után a
        //sorokban x jelöli a falat és szóköz a szabad járható részeket.
        //(Értelmes labirintust generálni nehezebb mint felolvasni, vagy akár kitalálni belőle, azt majd egy
        //hónap mulva.)
        Path mappa_eleresi_utvonala = Paths.get("", "_DataFiles").toAbsolutePath();
        // String uj_mappa_eleresi_utvonala = mappa_eleresi_utvonala + "/";
        File mappa = mappa_eleresi_utvonala.toFile();
        Path newDirectory = Files.createDirectories(mappa.toPath());
        Scanner sc = new Scanner(System.in);

        String fajlok;
        System.out.println(" Kerem adja meg a fajl eleresi utvonalat : ");
        fajlok = sc.nextLine();
        String kiterjesztes_txt = "Labirintus.txt";
        FileReader fr = new FileReader(fajlok + kiterjesztes_txt);
        Scanner scFileOlvaso = new Scanner(fr);

        int Sor = scFileOlvaso.nextInt();
        int Oszlop = scFileOlvaso.nextInt();
        //scFileOlvaso.nextLine();
        System.out.println(Sor + ", " + Oszlop);
        String Kilepes = "*";
        String[] tomb = new String[Sor];
        String beolvasando_szoveg = scFileOlvaso.nextLine();
        System.out.println(beolvasando_szoveg);
        tomb[0] = beolvasando_szoveg;


        for (int i = 1; i < Sor; i++) {
            //for (int j = 0; j < Oszlop; j++) {
            if (i < Sor) {
                beolvasando_szoveg = scFileOlvaso.nextLine();
                System.out.println(beolvasando_szoveg);
                tomb[i] = beolvasando_szoveg;

            } else {
                System.out.println("Vege");
            }
            // }
        }
        for (int i = 0; i < Sor; i++) {
            // for (int j = 0; j < Oszlop; j++) {

            System.out.println(tomb[i]);

        }
        //}


        fr.close();
    }

}