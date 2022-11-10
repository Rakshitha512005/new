public class javamethods{
    String carname ;
    String ownername;
    public javamethods(String car,String owner){
        carname=car;
        ownername=owner;
    }
    public static void main(String args[]){
        javamethods jm=new javamethods("BMW","Rakshitha");
        System.out.println("THE NAME OF THE CAR IS "+jm.carname+" "+"AND THE OWNER OF THIS CAR IS"+" "+jm.ownername);
    }
}
