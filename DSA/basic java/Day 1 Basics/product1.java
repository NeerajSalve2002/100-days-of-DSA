import java.util.*;
public class product1 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

         System.out.println("Enter a");
        int a = SC.nextInt();
        System.out.println("Enter b");
        int b = SC.nextInt();

        int product = a*b;
        System.out.println("Sum is: "+product);
    }
}