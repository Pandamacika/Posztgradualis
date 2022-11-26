import java.util.Scanner;

public class Main {
    //A Fibonacci sorozat elég természetellenes
    // képességű nyulak szaporodását modellezi.
    // A sorozat úgy indul, hogy 𝐹2=𝐹1=1.
    // Ezek után egy tetszőleges 𝐹𝑛 érteke úgy számolható ki,
    // hogy a sorozat két előző elemét összedadjuk 𝐹𝑛=𝐹𝑛−1+𝐹𝑛−2. (1,1,2,3,5,8,13,…)
    //Számolja ki 𝐹𝑛 értékét rekurzió segítségéve.

    public static void main(String[] args) {
        System.out.println(" Kerem adja meg,hogy meddig szeretne kiiratni a tomb erteket ?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(" A tomb elemei : ");
        for (int i=0;i<n;i++){
        System.out.print(Fibonacci(i)+",");
        }


    }

    private static int Fibonacci(int n) {
        int [] tomb = new int[n];
        if (n==0){return 1;}
        else if (n==1){return 1;}
        else {return Fibonacci(n-1)+Fibonacci(n-2);}


    }


}