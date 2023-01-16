import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ////Írjon egy programot ami bemenetként egy zárójelekből álló karaktersorozatot kap (olvassuk
        //        //fájlból), majd erről eldönti, hogy helyesen van-e zárójelezve a sorozat vagy sem.
        //        //Pl.: (({})[()()](())) helyes.
        System.out.println("Karaktersorozat!");
        Path mappa_eleresi_utvonala = Paths.get("", "_DataFiles" + "/" + "Verem.txt").toAbsolutePath();
        String uj_mappa_eleresi_utvonala = String.valueOf(mappa_eleresi_utvonala);
        File mappa = mappa_eleresi_utvonala.toFile();

        FileReader fr = new FileReader(mappa);
        Scanner scFileOlvaso = new Scanner(fr);
        String elsoSor = scFileOlvaso.nextLine();
        System.out.println(elsoSor);
        felbontja_a_karakterlancot(elsoSor);
        fr.close();


    }

    private static void felbontja_a_karakterlancot(String elsoSor) {
        int hossz = elsoSor.length();
        int[] zarojelek = new int[hossz];
        for (int i = 0; i < hossz; i++) {
            zarojelek[i] = elsoSor.charAt(i);
        }
        for (int i = 0; i < hossz; i++) {
            System.out.print(zarojelek[i] + ",");
        }
        System.out.println();
        int[] kod_tomb = {125, 41, 93};
        int[] kod_tomb_elemenek_parja = {123, 40, 91};

        IntVerem verem = new IntVerem();
        int[] kod = new int[hossz];
        for (int i = 0; i < hossz; i++) {
            kod[i] = (int) zarojelek[i];

            // System.out.print(kod + ",");
            for (int j = 0; j < 3; j++) {
                if (kod[i] == kod_tomb[j]) {
                    //  verem.Kivesz(zarojelek[i]);
                } else {
                    verem.Betesz(zarojelek[i]);
                }
            }

        }

        ArrayList<Integer> szamok = new ArrayList<>();
        System.out.println();
        for (int i = 0; i < hossz; i++) {
            kod[i] = (int) zarojelek[i];

            if ((kod[i] == kod_tomb[0]) || (kod[i] == kod_tomb[1]) || (kod[i] == kod_tomb[2])) {

                szamok.clear();
            } else {
                szamok.add(kod[i]);
            }


            //System.out.print(kod[i]+",");
        }
        if (szamok.isEmpty()) {
            System.out.println("A zarojelek rendben vannak");
        } else {
            System.out.println("A zarojelek nincsenek bezarva");
        }

        System.out.println(szamok);
        System.out.println();
        System.out.println("Kukucska: " + verem.Kukucska());


    }
}

class IntSor {
    LancoltLista adatokASorban;

    public IntSor() {
        adatokASorban = new LancoltLista();
    }

    public void SorbaAll(int adat) {
        adatokASorban.VegereBeszur(adat);
    }

    public int Sorelhagy() {
        int elsoErtek = adatokASorban.AdottPozicioLekerdezese(0);
        adatokASorban.ElejerolTorol();
        return elsoErtek;
    }

    public boolean Ures() {
        return adatokASorban.Hossz() == 0;
    }

    public int Kukucska() {
        return adatokASorban.AdottPozicioLekerdezese(0);
    }
}

class IntVerem {

    LancoltLista adatokAVeremben;

    public IntVerem() {
        adatokAVeremben = new LancoltLista();
    }

    public int Betesz(int adat) {
        adatokAVeremben.ElejereBeszur(adat);
        return adat;
    }

    public int Kivesz(int adat) {
        int elsoErtek = adatokAVeremben.AdottPozicioLekerdezese(0);
        adatokAVeremben.ElejerolTorol();
        return elsoErtek;
    }

    public boolean Ures() {
        return adatokAVeremben.Hossz() == 0;
    }

    public char Kukucska() {
        return (char) adatokAVeremben.AdottPozicioLekerdezese(0);
    }

}

class Lancszem {
    private Lancszem kovetkezo;
    private int adat;

    public void SetKovetkezo(Lancszem kovetkezo) {
        this.kovetkezo = kovetkezo;
    }

    public Lancszem GetKovetkezo() {
        return this.kovetkezo;
    }

    public void SetAdat(int adat) {
        this.adat = adat;
    }

    public int GetAdat() {
        return adat;
    }
}

class LancoltLista {
    private Lancszem elso;

    private Lancszem utolso;

    public LancoltLista() {
        this.elso = null;
        this.utolso = null;
    }

    public int Hossz() {
        Lancszem aktualisLancszem = this.elso;
        int elemszam = 0;
        while (aktualisLancszem != null) {
            ++elemszam;
            aktualisLancszem = aktualisLancszem.GetKovetkezo();
        }
        return elemszam;
    }

    public void AdottPozicionErtekadas(int poz, int adat) {
        Lancszem adottPozicionLevoSzem = this.elso;
        for (int i = 0; i < poz; i++) {
            adottPozicionLevoSzem = adottPozicionLevoSzem.GetKovetkezo();
        }
        adottPozicionLevoSzem.SetAdat(adat);
    }

    public int AdottPozicioLekerdezese(int poz) {
        Lancszem adottPozicionLevoSzem = this.elso;
        for (int i = 0; i < poz; i++) {
            adottPozicionLevoSzem = adottPozicionLevoSzem.GetKovetkezo();
        }
        return adottPozicionLevoSzem.GetAdat();
    }

    public void ElejerolTorol() {
        this.elso = this.elso.GetKovetkezo();
        if (this.elso == null)
            this.utolso = null;
    }

    public void PoziciorolTorol(int poz) {
        if (poz == 0) {
            ElejerolTorol();
            return;
        }

        Lancszem adottPozicioElottiSzem = this.elso;
        for (int i = 0; i < poz - 1; i++) {
            adottPozicioElottiSzem = adottPozicioElottiSzem.GetKovetkezo();
        }
        adottPozicioElottiSzem.SetKovetkezo(adottPozicioElottiSzem.GetKovetkezo().GetKovetkezo());

        // ha a lista vegerol toroltunk
        if (adottPozicioElottiSzem.GetKovetkezo().GetKovetkezo() == null) {
            this.utolso = adottPozicioElottiSzem;
        }
    }

    public void ElejereBeszur(int adat) {
        Lancszem ujElem = new Lancszem();
        ujElem.SetAdat(adat);

        ujElem.SetKovetkezo(this.elso);
        this.elso = ujElem;

        // ures listabol 1 elemu lista
        if (ujElem.GetKovetkezo() == null) {
            this.utolso = ujElem;
        }
    }

    public void VegereBeszur(int adat) {
        if (this.Hossz() == 0) {
            ElejereBeszur(adat);
            return;
        }

        Lancszem ujElem = new Lancszem();
        ujElem.SetAdat(adat);

        this.utolso.SetKovetkezo(ujElem);
        this.utolso = ujElem;
    }

    public void PozicioraBeszur(int poz, int adat) {
        if (poz == 0) {
            ElejereBeszur(adat);
        } else {
            Lancszem ujElem = new Lancszem();
            ujElem.SetAdat(adat);

            // utolso elem a pozicio elott
            Lancszem beszurandoElotti = this.elso;
            for (int i = 1; i < poz; i++) {
                beszurandoElotti = beszurandoElotti.GetKovetkezo();
            }

            ujElem.SetKovetkezo(beszurandoElotti.GetKovetkezo());
            beszurandoElotti.SetKovetkezo(ujElem);

            // ha a lista vegere szurtunk, az utolsot is allitani kell
            if (ujElem.GetKovetkezo() == null) {
                this.utolso = ujElem;
            }
        }
    }
}