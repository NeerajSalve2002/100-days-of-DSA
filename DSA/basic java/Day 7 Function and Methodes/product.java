public class product {
    
    public static int Multiplay(int a, int b)
    {
        int product = a*b;
        return product;
    }

    public static void main(String[] args) {
        int a= 10;
        int b = 5;
        int prod =  Multiplay(a, b); ;
        System.out.println("Product is : " + prod);
    }
    
}
