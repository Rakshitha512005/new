public class Foreachex {
    public static void main(String[] args) {
        String array[] = {"Rakshitha", "Lekhana", "Renuka", "Adishesharao"};
        int array2[] = {10, 20};
        int total = 0;

        for (String i : array) {
            System.out.println(i);
        }
        {
            for (int a : array2) {
                System.out.println(a);
                total = total + a;
            }
            {
                System.out.println("total:" + total);
            }
        }

    }
}
