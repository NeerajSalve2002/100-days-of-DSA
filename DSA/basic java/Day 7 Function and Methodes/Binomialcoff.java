import java.util.*;

public class Binomialcoff {

    public static int Fact(int n)    
    {
        int f = 1;

        for(int i = 1; i<=n; i++)
        {
            f=f*i;
        }
        return f;
    }

    public static int  binocoffi(int n, int r)
    {
        int fact_n = Fact(n);
        int fact_r= Fact(r);
        int fact_nmr = Fact(n-r);

        int binocoffi = fact_n/ (fact_r*fact_nmr) ;

        
        return binocoffi;
    }

      public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = sc.nextInt();

         System.out.println("Enter r ");
        int r = sc.nextInt();
            System.out.println(binocoffi(n,r));


    }
    
}
