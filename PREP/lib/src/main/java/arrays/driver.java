package arrays;

public class driver
{
   private char[][] arrayToBeReversed = {
            {'H','e','l','l','o',' ','W','o','r','l','d'},
            {'h','e'},
            {'H'}
   };
            
   
   public char[] getArrayToBeReversed(int i) {
      return arrayToBeReversed[i];
   }
   
   public void reverseArrayExample() {
      for (int i=0; i< arrayToBeReversed.length; i++) {
         System.out.printf("Reversion %d --------------\n", i);
         System.out.println(getArrayToBeReversed(i));
         ArrayUtils.reverseArray(getArrayToBeReversed(i));
         System.out.println(getArrayToBeReversed(i));
      }
   }
   
   public static void main(String[] args) {
      driver d = new driver();
      
      // reverse an array
      d.reverseArrayExample();
      
   }
}
