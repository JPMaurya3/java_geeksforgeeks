//Given a number n, check whether it is even or odd. Return true for even and false for odd.
/*we can operator return true and false */

public class Check_Number {

    public static boolean isEven(int n){
        return (n % 2 == 0);
    }
    public static void main(String[] args) {
        int n = 101;
        isEven(n);
        if(isEven(n) == true){
            System.out.println("true");
        }else{
            System.out.println("false");

        }
    }
}
