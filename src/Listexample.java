import java.util.ArrayList;
import java.util.List;
public class Listexample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("mango");
        list.add("apple");
        list.add("kiwi");
        list.add("banana");

        for (String fruits : list) {
            System.out.println("Best fruit is"+" "+fruits);
        }
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(10);
        list1.add(40);
         for(int numbers:list1) {
             System.out.println(numbers);
         }
//addition
         int adding= list1.get(1) + list1.get(0);
        System.out.println("Addition value"+" "+adding);

//remove function
        int newval=list1.remove(1);
             System.out.println("removed value"+" "+newval);
//size function
             int findsize= list.size();
        System.out.println("The size of list is"+" "+findsize);
//contains function
        boolean find=list.contains("apple");
        System.out.println(find);
        }
    }