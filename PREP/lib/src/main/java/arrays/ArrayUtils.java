package arrays;

public class ArrayUtils
{
   public static final void reverseArray(char[] array) {
      int len = array.length -1;
      for (int i = 0; i<= len-1; i++) {
         array[i] ^= array[len-i];
         array[len-i] ^= array[i];
         array[i] ^= array[len-i];
      }
      return;
   }
}
