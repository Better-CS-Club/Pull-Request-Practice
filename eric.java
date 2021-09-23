public class eric{
  public static void main(String[] args){
    change(45.81);
    change(0);
    change(-100);
  }
  public static void change(double d){
    int[] currency = {10000, 5000, 2000, 1000, 500, 200, 100, 25, 10, 5, 1};
    int cents = (int)(d*100);
    for (int i = 0; i < currency.length; i++){
      int count = 0;
      while (cents - currency[i] >= 0){
        count++;
        cents -= currency[i];
      }
      if (count > 0)
        System.out.println(String.format("$%.2f : %d", ((double)currency[i])/100, count) );
    }
  }
}
