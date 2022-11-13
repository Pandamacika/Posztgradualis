public class Main {
    public static void main(String[] args) {
        //Fogalmazd át az: if (!b && a) {…}
        //feltételt óly módon, hogy ne használjon && kapcsolatot. (Tipp: !!x = x.)
        System.out.println(" Logikai fuggveny ! ");
        boolean[] a = {false, false, true, true};
        boolean[] b = {false, true, false, true};
        System.out.print(" a = ");
        for (int i = 0; i < 4; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
        System.out.print(" b = ");
        for (int i = 0; i < 4; i++) {
            System.out.print(b[i] + ",");
        }
        System.out.println();
        System.out.print(" b tagadasa :");
        b_tagadasa(b);
        System.out.println();
        System.out.println(" Az eredmeny : ");
        eredmeny(a, b);
        System.out.println();
        eredmeny_maskepp_2(a, b);
    }

    private static void eredmeny_maskepp_2(boolean[] a, boolean[] b) {
        boolean[] eredmeny_maskepp = new boolean[4];
        for (int i = 0; i < 4; i++) {
            eredmeny_maskepp[i] = !(b[i] || !a[i]);
            System.out.print(eredmeny_maskepp[i] + ",");
        }
    }

    private static void eredmeny(boolean[] a, boolean[] b) {
        boolean[] eredmeny = new boolean[4];
        for (int i = 0; i < 4; i++) {
            eredmeny[i] = (!b[i] && a[i]);
            System.out.print(eredmeny[i] + ",");
        }
    }

    private static void b_tagadasa(boolean[] b) {
        boolean[] b_tagadas = new boolean[4];
        for (int i = 0; i < 4; i++) {
            b_tagadas[i] = (!b[i]);
            System.out.print(b_tagadas[i] + ",");
        }
    }
}