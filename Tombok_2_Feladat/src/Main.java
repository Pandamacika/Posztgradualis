import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Írj egy programot, ami beolvas 3 keresztnevet
        // (feltételezhető, hogy amit beír a felhasználó,
        // az keresztnév), majd ezeket ábécé sorrendben kiírja.
        System.out.println(" Ez a program ABC sorrendbe rendszerezi az adatokat");
        Scanner sc = new Scanner(System.in);
        String[] nevek = new String[3];
        System.out.println("Kerem adja meg az elso keresztnevet : ");
        nevek[0] = sc.nextLine();
        System.out.println("Kerem adja meg a masodik keresztnevet : ");
        nevek[1] = sc.nextLine();
        System.out.println("Kerem adja meg a harmadik keresztnevet : ");
        nevek[2] = sc.nextLine();
        System.out.println(" A nevek a kovetkezoek: " + nevek[0] + "," + nevek[1] + "," + nevek[2]);


        if ((nevek[0].compareTo(nevek[1]) < 0) && (nevek[0].compareTo(nevek[2]) < 0) && nevek[1].compareTo(nevek[2]) < 0) {
            System.out.println(nevek[0] + "," + nevek[1] + "," + nevek[2]);
        } else if ((nevek[0].compareTo(nevek[1]) < 0) && (nevek[0].compareTo(nevek[2]) < 0) && nevek[2].compareTo(nevek[1]) < 0) {
            System.out.println(nevek[0] + "," + nevek[2] + "," + nevek[1]);
        } else if ((nevek[1].compareTo(nevek[0])) < 0 && (nevek[1].compareTo(nevek[2])) < 0 && (nevek[0].compareTo(nevek[2])) < 0) {
            System.out.println(nevek[1] + "," + nevek[0] + "," + nevek[2]);
        } else if ((nevek[1].compareTo(nevek[0])) < 0 && (nevek[1].compareTo(nevek[2])) < 0 && (nevek[2].compareTo(nevek[0])) < 0) {
            System.out.println(nevek[1] + "," + nevek[2] + "," + nevek[0]);
        } else if ((nevek[2].compareTo(nevek[0])) < 0 && (nevek[2].compareTo(nevek[1])) < 0 && (nevek[0].compareTo(nevek[1])) < 0) {
            System.out.println(nevek[2] + "," + nevek[0] + "," + nevek[1]);
        } else if ((nevek[2].compareTo(nevek[0])) < 0 && (nevek[2].compareTo(nevek[1])) < 0 && (nevek[1].compareTo(nevek[2])) < 0){
            System.out.println(nevek[2] + "," + nevek[1] + "," + nevek[0]);}


    }


}
