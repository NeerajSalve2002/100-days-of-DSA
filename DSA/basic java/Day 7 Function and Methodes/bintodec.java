public class bintodec {
    
    public static void btod(int n)
    {
        int pow= 0;
        int  mynum = n;
        int decNum = 0;

        while(n>0)
        {
            int lastdig = n% 10; //remove last dig
            decNum = decNum + (lastdig * (int)Math.pow(2, pow));
            pow++;
            n = n/10;
        }
        System.out.println("Decimal of "+mynum + " = " +decNum);
    }

    public static void main(String[] args) {
        btod(100110);
    }
}
