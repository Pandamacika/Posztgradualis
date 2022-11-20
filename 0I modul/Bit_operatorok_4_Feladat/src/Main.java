import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Írj egy programot ami beolvas egy tetszőleges egész számot,
        // majd egy 0 és 4 közötti egész számot.
        // Ha a második szám nem 0 és négy közötti, dorongold le a felhasználót.
        //       Ezek után írd ki az első szám másodikkal binárisan eltolt értékeit
        //       mind a három tanult bináris eltolás operátorral (<<, >>, >>>)

        System.out.println(" Ez a program binarisan eltolt erteket szamol!");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Kerem adjon meg egy egesz szamot : ");
        int szam = sc.nextInt();
        System.out.println(" Kerem adjon meg egy szamot 1 es 4 kozott : ");
        int a = sc.nextInt();
        if ((a >= 1) && (a <= 4))
            System.out.println(" Megfelelo szam ");
        else {
            System.out.println(" Nem megfelelo szam . Kerem adjon meg egy szamot 1 es 4 kozott ! ");
            a = sc.nextInt();
            System.out.println(" Megfelelo szam ");
        }
        int szam_sz_a = szam << a;
        System.out.println(" Az elso szamot megszorozza a 2 azon hatvanyaval, melyet a masodik beolvasott szam jelez : ");
        System.out.println(" Az eltolas eredmenye : " + szam_sz_a);
        System.out.println(" Az elso szamot elosztja a 2 azon hatvanyaval, melyet a masodik beolvasott szam jelez : ");
        int szam_o_a = szam >> a;
        System.out.println(" Az eltolas eredmenye : " + szam_o_a);
        int szam_a = szam >>> a;
        System.out.println(" Az eltolas eredmenye : " + szam_a);
    }
}