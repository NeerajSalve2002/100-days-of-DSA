import java.util.*;
public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no A: ");
        int a = sc.nextInt();
         System.out.println("Enter no B: ");
        int b = sc.nextInt();

        if (a<b) 
        {
            System.out.println("A is Smaller");
        }
        else{
            System.out.println("B is smaller");
        }
    }
}
