import java.util.*;

public class elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Your Income: ");

        int Income = sc.nextInt();
        int tax;

        if(Income < 500000){
            System.out.println("0% Tax. ");
        }
        else if(Income <=1000000 && Income >= 500000 ){

            tax = (int) (Income*0.2);

            System.out.println("20% Tax. "+ tax);
        }
        else if(Income > 100000 ){
            tax = (int) (Income*0.3);

            System.out.println("30% Tax. "+ tax);
        }

        

    }    
}
