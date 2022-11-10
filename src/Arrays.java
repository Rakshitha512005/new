public class Arrays {
    public static void main(String[] args) {
        String[] fruits={"mango","banana","apple","kiwi"};
        fruits[0]="watermelon";
        System.out.println(fruits[0]);
        int l=fruits.length;
        System.out.println("THE LENGTH OF FRUITS IS"+" "+l);
        for(int a=0;a<fruits.length;a++){
            System.out.println(fruits[a]);
        }
    }
}
