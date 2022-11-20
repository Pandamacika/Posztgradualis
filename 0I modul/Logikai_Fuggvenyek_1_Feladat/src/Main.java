
public class Main {
    public static void main(String[] args) {
        // Fogalmazd át a következő igaz-hamis feltételt a lehető legrövidebb alakba:
        // if ((!a && !b) || (b && a) || (!b && a)){...}
        boolean[] a = {false, false, true, true};
        boolean[] b = {false, true, false, true};
        boolean[] elso_zarojel = new boolean[4];
        for (int i = 0; i < 4; i++) {
            elso_zarojel[i] = (!a[i] && !b[i]);
            System.out.print(elso_zarojel[i]+",");
        }
        System.out.println();
        boolean[] masodik_zarojel = new boolean[4];
        for (int i = 0; i < 4; i++) {
            masodik_zarojel[i] = (b[i] && a[i]);
            System.out.print(masodik_zarojel[i]+",");
        }
        System.out.println();
        boolean [] harmadik_zarojel = new boolean[4];
        for (int i=0;i<4;i++){
            harmadik_zarojel[i] = (!b[i] && a[i]);
            System.out.print(harmadik_zarojel[i]+",");
        }
        System.out.println();
        System.out.println();
        boolean [] vegso_megoldas = new boolean[4];
        for (int i=0;i<4;i++){
            vegso_megoldas[i] = (elso_zarojel[i]||masodik_zarojel[i]||harmadik_zarojel[i]);
            System.out.print(vegso_megoldas[i]+",");
        }
    }


}
