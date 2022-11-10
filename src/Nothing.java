 class Something{
    String Name;
    String Sem;
    String Register;

    public static void Data(){
        System.out.println("ITS ONLY STUDENT DETAILS");
    }

    public void myName(){
        System.out.println(this.Name);
    }
    public void mySem(){
        System.out.println(this.Sem);
    }
}
public class Nothing {
    public static void main(String[] args) {
        Something st=new Something();
        st.Name="RAKSHITHA";
        st.Sem="5";
        st.Register="108cs20037";

        Something st1=new Something();
        st1.Name="LEKHANA";
        st1.Sem="10";
        st1.Register="45";

        st.myName();
        st1.myName();
        st.mySem();
        st1.mySem();
        Something.Data();
    }
}
