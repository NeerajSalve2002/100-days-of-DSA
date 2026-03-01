public class forreverse {
    public static void main(String[] args) {
        
        int n=11012002;

        while(n>0)
        {
            int Lastdigit = n%10;
            System.out.print(Lastdigit+" ");
            n=n/10;

        }
    }
}
