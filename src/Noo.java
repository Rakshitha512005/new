public class Noo{
    public void main() {
        System.out.println("This is rakshitha");
    }
    class New extends Noo{
            public void main2(){
            System.out.println("This is lekhana");
        }
    }
    class Noo1 extends New{
        public static void main(String[] args) {
            Noo no=new Noo();
            no.main();
        }
    }
}

