import java.util.*;

public class parafunction {
 
    public static void Parafun(int a, int b)
    {
        int sum = a+b;
        System.out.println("Sum is: "+ sum);
    }
    
    //main
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b:  ");
        int b = sc.nextInt();

        Parafun(a,b);
        
    }
}
