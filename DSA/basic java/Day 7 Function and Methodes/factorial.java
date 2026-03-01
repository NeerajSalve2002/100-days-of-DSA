import java.util.*;

public class factorial {

    public static int Fact(int n)    
    {
        int f = 1;

        for(int i = 1; i<=n; i++)
        {
            f=f*i;
        }
        
        System.out.println("Factorial is: " + f);
        return f;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = sc.nextInt();
        Fact(n);

    }
}
