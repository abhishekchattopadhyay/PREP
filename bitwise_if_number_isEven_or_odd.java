public class util {
  public static boolean isOdd(int number) {
    if(number ^ 1 == number + 1) return false;
    return true;
  }
}
