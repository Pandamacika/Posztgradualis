import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Írj programot mely beolvas két karakterláncot.
        // Majd megnézi, hogy az egyik benne van-e a másikban
        // és ennek megfelelően kiírja, hogy az első része a másiknak,
        // a második az elsőnek, egyenlőek, vagy egyik sem.
        System.out.println(" Ez a program ket karakterlancot hasonlit ossze . ");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Kerem adja meg az elso karakterlancot : ");
        String elso = sc.nextLine();
        System.out.println(" Kerem adja meg a masodik karakterlancot : ");
        String masodik = sc.nextLine();
        boolean azonos_szo = elso.contains(masodik);
        if (azonos_szo) {
            System.out.println(" azonos mondatresz : ".concat(masodik));
        }
    }
}