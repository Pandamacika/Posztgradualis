public class Main {
    public static void main(String[] args) {
        //Vizsgáld meg, hogy mi történik, ha a 20-at és a 30-at
        // minden lehetséges típuskombinációban összeadod
        // (mindkettőt értelmezhetjük számként (int 20, double 20)
        // vagy karakterláncként (“20”)).
        //Mely kombinációkat nem engedi a Java végrehajtani,
        // mert nem tudja értelmezni? Amit enged, azoknak mi az eredménye?
        System.out.println(" Ez a program ket szamot ad ossze !");
        int a = 20;
        int b = 30;
        double c = 20;
        double d = 30;
        String e = "20";
        String f = "30";
        var osszeg_int = a + b;
        System.out.println(" A ket szam osszege,ha mindketto int : " + osszeg_int);
        var osszeg_int_double = a + d;
        System.out.println(" A ket szam osszege,ha az egyik int a masik szam double : " + osszeg_int_double);
        var osszeg_int_string = a + f;
        System.out.println(" A ket szam osszege,ha az egyik int a masik szam string : " + osszeg_int_string);
        var osszeg_double_string = c + f;
        System.out.println(" A ket szam osszege,ha az egyik double a masik szam string : " + osszeg_double_string);
        var osszeg_string_int = e + b;
        System.out.println(" A ket szam osszege,ha az egyik szam string tipusu,a masik int : " + osszeg_string_int);
    }
}