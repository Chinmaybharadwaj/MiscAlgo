public class ReverseaNumberRecursion {
    public static void main(String[] args) {
        System.out.println(reverse(123,0));
    }

    static int reverse(int n,int ca){
        if(n <= 0){
            return ca;
        }
        ca = ca*10 + n%10;
        return reverse(n/10, ca);
    }

    
}
