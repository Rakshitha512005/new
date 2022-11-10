import java.util.Locale;

class strings {
    public static void main(String args[]){
        String one="JAVA";
        //finding out the length
        int l=one.length();
        System.out.println("THE LENGTH OF STR1 IS::"+l);

        //to join two strings
        String two="Script";
        String three=one.concat(two);
        System.out.println("THE CONCATINATION OF TWO STRINGS IS::"+three);

        //compare to strings
        boolean four=one.equals(two);
        System.out.println("COMPARE OF TWO STRINGS::"+four);

        //contains operation
        boolean five=two.contains("S");
        System.out.println("CONTAIN OPERATION::"+five);

        //replace operation
        String six=one.replace("J","k");
        System.out.println("REPLACEMENT OPERATION::"+six);

        //character at function
        char seven=two.charAt(3);
        System.out.println("THE POSITION OF THE CHARACTER IS::"+seven);

        //compare to ignore case function
        int eight=two.compareToIgnoreCase(one);
        System.out.println("COMPARISION BY IGNORING THE CASE::"+eight);

        //content equals function
        boolean nine=one.contentEquals(two);
        System.out.println("TO CHECK THE EQUALITY::"+nine);

        //conversion to lowercase
        String ten= one.toLowerCase(Locale.ROOT);
        System.out.println("CONVERSION TO LOWERCASE::"+ten);

        //conversion to uppercase
        String one1=two.toUpperCase(Locale.ROOT);
        System.out.println("CONVERSION TO UPPERCASE::"+one1);

        //byte conversion
        //byte[] two2 =two.getBytes();
        //System.out.println("CONVERSION TO BYTE CODE"+two2);

        boolean two2=two.endsWith("t");
        System.out.println("RESULT::"+ two2);

    }
}


