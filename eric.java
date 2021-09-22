public class eric{
    public static void main(String[] args){
        change(45.81);
    }
    public static void change(double c){
        int[] currency = {10000, 5000, 2000, 1000, 500, 200, 100, 25, 10, 5, 1};
        int[] count = new int[11];
        int i = 0;
        int d = ((int) (c*100));
        while (d > 0){
            if (d - currency[i] >= 0){
                count[i]++;
                d -= currency[i];
            }
            else
                i++;
        }
        for (int j = 0; j < currency.length; j++){
            if (count[j] == 0) continue;
            if (currency[j] < 100)
                System.out.println(currency[j] + "c - " + count[j]);
            else
                System.out.println("$" + currency[j]/100 + " - " + count[j]);
        }
    }
}