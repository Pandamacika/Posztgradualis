import java.util.Scanner;

public class Main {
    public static int n;
    public static String jel ="*";

    public static void main(String[] args) {
        //Írjon ki a képernyőre n darab csillagot.
        // Oldja meg kétféleképpen is. Iteratív módon és rekurzíó felhasználásával.

        Scanner sc = new Scanner(System.in);
        System.out.println(" Kerem adja meg hany csillagot szeretne kiiratni ? ");
        n = sc.nextInt();
        String kiirja_az_eredmenyt=Csillag(jel,n);
        System.out.print(kiirja_az_eredmenyt);


    }

    private static String Csillag (String csillag_jel, int n) {
        String rajzol ="";
        String eredmeny="";
        if (n==0){
            return "";
        }
        else if(n>0) {
            rajzol= Csillag(csillag_jel,n-1);
            eredmeny = rajzol+jel;
        }
        return eredmeny;
    }


}