import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Egy 𝑛 egész szám esetén 𝑛! jelöli 1-től 𝑛-ig a számok szorzatát. 5! = 1 ⋅ 2 ⋅ 3 ⋅ 4 ⋅ 5. Írjon rekurzív
        //algoritmust amely kiszámolja 𝑛! értékét.

        System.out.println(" Ez a program faktorialist szamol : ");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Kerem adja meg,hogy melyik szam faktorialisat szeretne kiszamolni : ");
        int n = sc.nextInt();
        Faktorialis(n);
        System.out.println(Faktorialis(n));
    }

    private static int Faktorialis(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * Faktorialis(n - 1);
        }
    }
}