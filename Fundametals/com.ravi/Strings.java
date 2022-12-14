package JavaGuide.Fundametals.com.ravi;

public class Strings {
    String name ="ravi";
    String name2 ="ndra";
    String finalname =name+name2;
    System.out.println(finalname);


    //position
    System.out.println(finalname.charAt(5));
    //length
    System.out.println(name.length());
    //replace
    String finall =finalname.replace('a','b');
    //substring
    System.out.println(name.substring(0,3));
}
