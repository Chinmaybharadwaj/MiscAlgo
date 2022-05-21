/**
 * FibinocciNumber
 * This program prints the nth fibinocci number
 */
public class FibinocciNumber {
    public static void main(String[] args) {
        System.out.println(getFib(3));
    }

    public static int getFib(int num){
        if(num <= 1){
            return num;
        }
        return getFib(num-1)+getFib(num-2);
    }
}