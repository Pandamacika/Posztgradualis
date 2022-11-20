import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Írj egyprogramot,amibeolvas egyegész számot, binárisan összeéseli 512-vel,majd az eredményt kíjra.
        //Ennek a programnak a segítségével adj meg 3-3 olyan különböző számot ami:
        // a. Kisebb mint 512 és a program kimenete 0.
        //b. Nagyobb mint 512 és a program kimenete 512.
        // c.	Nagyobb mint 512 és a program kimenete 0.
        //(próbáljuk okosan kitalálni, hogy mivel érdemes próbálkozni)
        System.out.println("Ez a program Bit operatorokat hasznal, osszeeseli a szamokat!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Kerem adjon meg egy szamot,amivel szeretne osszeeselni az 512-t");
        int e = sc.nextInt();
        int a = 512;
        int aese = a & e;
        System.out.println(" Az On altal megadott szam osszeeselesi eredmenye : " + aese);
        int b = 12;
        int c = 84;
        int d = 52;
        int aesb = a & b;
        int aesc = a & c;
        int aesd = a & d;
        System.out.println(" Az osszeeseles eredmenye 0,ha a megadott szam kisebb,mint 512 : " + aesb + "," + aesc + "," + aesd);
        int f = 514;
        int g = 700;
        int h = 1023;
        int aesf = a & f;
        int aesg = a & g;
        int aesh = a & h;
        System.out.println(" Az osszeeseles eredmenye 512,ha a megadott szam nagyobb,mint 512 : " + aesf + "," + aesg + "," + aesh);
        int i = 1024;
        int j = 1500;
        int k = 1535;
        int aesi = a & i;
        int aesj = a & j;
        int aesk = a & k;
        System.out.println(" Az osszeeseles eredmenye 0, ha a megadott szam nagyobb,mint 512 : " + aesi + "," + aesj + "," + aesk);
    }
}