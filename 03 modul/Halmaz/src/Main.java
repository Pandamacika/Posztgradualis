import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 16/2. Implementálja a halmaz adattípust
        //• statikus tömbök használatával,
        //• dinamikus tömbök használatával,
        //• dinamikus tömbök használatával, de hatékonyan (számokra).

        //StringHalmazDinamikusTombbel halmaz1 = new StringHalmazDinamikusTombbel();
        // StringHalmazDinamikusTombbel halmaz2 = new StringHalmazDinamikusTombbel();
        StringHalmazStatikusTombbel halmaz1 = new StringHalmazStatikusTombbel();
        StringHalmazStatikusTombbel halmaz2 = new StringHalmazStatikusTombbel();
        StringHalmazStatikusTombbel egyesitese_ket_halmaznak = new StringHalmazStatikusTombbel();
        StringHalmazStatikusTombbel metszete_ket_halmaznak = new StringHalmazStatikusTombbel();
        StringHalmazStatikusTombbel kulonbsege_ket_halmaznak = new StringHalmazStatikusTombbel();
        halmaz1.HozzaAd("alma"); //{a}
        halmaz1.HozzaAd("korte"); //{a,k}
        halmaz1.HozzaAd("banan"); //{a,k,b}
        halmaz1.HozzaAd("eper"); //{a,k,b,e}
        halmaz1.HozzaAd("szilva");
        halmaz1.HozzaAd(" ");

        //halmaz1.Kivesz("banan"); //{a,k,e}

        halmaz2.HozzaAd("szolo"); // {2}
        halmaz2.HozzaAd("alma"); // {2,3}
        halmaz2.HozzaAd("korte"); // {2,3}
        halmaz2.HozzaAd("kivi");
        halmaz2.HozzaAd("dio"); // {2,3}
        halmaz2.HozzaAd(" ");
        egyesitese_ket_halmaznak.Egyesit(halmaz1, halmaz2);
        metszete_ket_halmaznak.Metszet(halmaz1, halmaz2);
        kulonbsege_ket_halmaznak.Kivon(halmaz1, halmaz2);

    }

    static class StringHalmazStatikusTombbel {
        private String[] taroltErtekek;

        public StringHalmazStatikusTombbel() {
            taroltErtekek = new String[0];
        }

        public boolean HozzaAd(String elem) {
            if (BenneVan(elem))
                return false;
            else {
                String[] ujTaroltErtekek = new String[this.taroltErtekek.length + 1];
                for (int i = 0; i < this.taroltErtekek.length; i++) {
                    ujTaroltErtekek[i] = this.taroltErtekek[i];

                }
                for (int j = 0; j < this.taroltErtekek.length; j++) {
                    System.out.print(ujTaroltErtekek[j] + " ");
                }
                System.out.println();
                ujTaroltErtekek[ujTaroltErtekek.length - 1] = elem;
                this.taroltErtekek = ujTaroltErtekek;

                return true;
            }
        }

        public boolean BenneVan(String elem) {
            for (int i = 0; i < taroltErtekek.length; i++) {
                if (taroltErtekek[i].equals(elem)) {

                    i++;

                }
            }
            return false;
        }

        public StringHalmazStatikusTombbel Egyesit(StringHalmazStatikusTombbel halmaz1, StringHalmazStatikusTombbel halmaz2) {
            StringHalmazStatikusTombbel eredmeny = new StringHalmazStatikusTombbel();
            for (int i = 0; i < this.taroltErtekek.length; i++) {
                eredmeny.HozzaAd(this.taroltErtekek[i]);

            }
            System.out.println();

            for (int i = 0; i < halmaz1.taroltErtekek.length; i++) {
                eredmeny.HozzaAd(halmaz1.taroltErtekek[i]);

            }
            for (int i = 0; i < halmaz2.taroltErtekek.length; i++) {

                if (i == halmaz2.taroltErtekek.length - 1) {
                    System.out.println("Az egyesites eredmenye : ");

                }
                eredmeny.HozzaAd(halmaz2.taroltErtekek[i]);

            }

            return eredmeny;
        }

        public StringHalmazStatikusTombbel Metszet(StringHalmazStatikusTombbel halmaz4, StringHalmazStatikusTombbel halmaz5) {

            StringHalmazStatikusTombbel metszet = new StringHalmazStatikusTombbel();
            for (int i = 0; i < halmaz4.taroltErtekek.length; i++) {
                if (i == halmaz4.taroltErtekek.length - 1) {
                    System.out.println("A ket halmaz kozos eleme, metszete : ");
                }
                for (int j = 0; j < halmaz5.taroltErtekek.length; j++) {
                    if (halmaz5.taroltErtekek[j].equals(halmaz4.taroltErtekek[i])) {
                        metszet.HozzaAd(halmaz5.taroltErtekek[j]);

                    }
                }

            }
            return metszet;
        }

        public ArrayList<String> Kivon(StringHalmazStatikusTombbel halmaz, StringHalmazStatikusTombbel kivonando) {
            StringHalmazStatikusTombbel eredmeny = new StringHalmazStatikusTombbel();
            ArrayList<String> uj_halmaz = new ArrayList<>();
            for (int i = 0; i < halmaz.taroltErtekek.length; i++) {
                uj_halmaz.add(halmaz.taroltErtekek[i]);
                for (int j = 0; j < kivonando.taroltErtekek.length; j++) {

                    if (halmaz.taroltErtekek[i].equals(kivonando.taroltErtekek[j])) {
                        uj_halmaz.remove(halmaz.taroltErtekek[i]);
                    }
                }
            }
            System.out.println("A ket halmaz kulonbsege : ");
            System.out.print(uj_halmaz + " ");
            return uj_halmaz;

        }

        public int Szamossag() {
            System.out.println(" Szamossag : ");
            return taroltErtekek.length;
        }
    }

}
