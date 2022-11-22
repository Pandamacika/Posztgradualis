public class Main {
    public static int db = 8;

    public static void main(String[] args) {
       //Fogalmazd át a következő igaz-hamis feltételt a lehető legrövidebb alakba
        // : if ((!a && b) || (!b && c) || (a && c) || (!a && !c) || (b && c)){...}
        System.out.println(" Logikai fuggveny ! ");
        boolean[] a = {false, false, false, false, true, true, true, true};
        boolean[] b = {false, false, true, true, false, false, true, true};
        boolean[] c = {false, true, false, true, false, true, false, true};

        System.out.print(" a = ");
        for (int i = 0; i < db; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
        System.out.print(" b = ");
        for (int i = 0; i < db; i++) {
            System.out.print(b[i] + ",");
        }
        System.out.println();
        System.out.print(" c = ");
        for (int i = 0; i < db; i++) {
            System.out.print(c[i] + ",");
        }
        System.out.println();
        System.out.println(" Az eredmeny : ");
        eredmeny(a, b, c);
        System.out.println();
        eredmeny_maskepp_2(a, b, c);
        boolean [] uj_eredmeny = new boolean[db];



    }

    private static void eredmeny_maskepp_2(boolean[] a, boolean[] b, boolean[] c) {
        boolean[] eredmeny_maskepp = new boolean[db];
        for (int i = 0; i < db; i++) {

            eredmeny_maskepp[i] = ((c[i])||(!a[i]&&b[i])||(!a[i]&&!b[i]&&!c[i]));
            System.out.print(eredmeny_maskepp[i] + ",");
        }
    }

    private static void eredmeny(boolean[] a, boolean[] b, boolean[] c) {
        boolean[] eredmeny = new boolean[db];
        for (int i = 0; i < db; i++) {

            eredmeny[i] = ((!a[i] && b[i]) || (!b[i] && c[i]) || (a[i] && c[i]) || (!a[i] && !c[i]) || (b[i] && c[i]));
            System.out.print(eredmeny[i] + ",");
        }
    }


}