import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //Írj egy programot ami bekér egy karakterláncot,
        // majd kiírja ezt úgy, hogy az első és utolsó karaktert felcseréli.
        // Figyeljünk, hogy minden hosszúságú karakterláncra jól működjön a program.
        System.out.println(" Ez a program beolvas egy karakterlancot es felcsereli az elso es utolso betujet . ");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Kerem adja meg a karakterlancot : ");
        String karakterlanc = sc.nextLine();
        char elso_betu = karakterlanc.charAt(0);
        int karakterek_szama = karakterlanc.length();
        char utolso_betu = karakterlanc.charAt(karakterek_szama - 1);
        System.out.println(" A karakterlanc szama : " + karakterek_szama);
        System.out.println(" A karakterlanc elso betuje : " + elso_betu);
        System.out.println(" A karakterlanc utolso betuje : " + utolso_betu);
        if (karakterek_szama <= 1) {
            karakterlanc = karakterlanc;
         } else {
            karakterlanc = utolso_betu + karakterlanc.substring(1, karakterek_szama - 1) + elso_betu;
         }
        System.out.println(" Az elso karaktert az utolsora csereli : " + karakterlanc);

    }
}