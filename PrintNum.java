public class PrintNum {
    public static void main(String[] args) {
            printNum(5);
    }

    public static void printNum(int num){
        if(num>1){
            printNum(num-1);
        }
        System.out.println(num);
    }
}
