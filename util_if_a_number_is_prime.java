public class Solution {
    public static void main(String args[]) {
        int[] input = {0,1,2,3,4,5,6,7,8,9,10,1015843};
        for (int i=0; i< input.length; i++) {
            if (isPrime(input[i])) {
                System.out.printf("%d is a Prime number\n", input[i]);
            }
        }
    }
    
    private static boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        int i = 3;
        for (;i*i <= num;) {
            if (num % i == 0) {
                return false;
            }
            i+=2;
        }
        return true;
    }
}
/* non optimal solution*/
