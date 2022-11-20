import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Írj programot amiben a felhasnzálónak lehetősége van megadni,
        // hogy egy kör sugarát vagy átmérőjét szeretné megadni.
        // Ezek utánkérd be a választott adatot,majd számold ki a kör területét és írd ki.
        System.out.println(" Ez a program egy kor teruletet szamolja ki .");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Irjon kicsi S betut,ha sugarat szeretne megadni es kicsi A betut,ha az atmerot : ");
        double s;
        String valaszt = sc.next();
        if (valaszt.equals("s")) {
            System.out.println(" Kerem adja meg a kor sugarat : ");
            double sugar = sc.nextDouble();
            System.out.println(" A kor terulete : " + Math.pow(sugar, 2) * Math.PI);
        } else if (valaszt.equals("a")) {
            System.out.println(" Kerem adja meg a kor atmerojet : ");
            double atmero = sc.nextDouble();
            s = atmero / 2;
            System.out.println(" A kor terulete : " + Math.pow(s, 2) * Math.PI);
        }

    }
}