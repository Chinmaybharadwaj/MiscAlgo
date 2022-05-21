import java.util.Scanner;

public class Product1ton {
    

    public static void main(String[] args) {
        System.out.println("Product from 1 to n");
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        sc.close();
        int product = getPrduct(n);
       System.out.println(product);
    }

    static int getPrduct(int n){
        if(n<2){
            return n;
        }
        int p = n*getPrduct(n-1);
        System.out.println(p);
        return p;
    }
}
