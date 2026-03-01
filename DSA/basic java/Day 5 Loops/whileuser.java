import java.util.*;
public class whileuser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Num Value: ");

        int num = sc.nextInt();

          System.out.println(" ");
        int i = 0;
        while(i<=num)
        {
            System.out.println(i);
            i++;
        }
    }
}
