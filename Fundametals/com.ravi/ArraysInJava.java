import java.util.Arrays;
public class ArraysInJava {
    public static void main(String args[]) {
        // consider if u want to enter student marks which of same data type u create a
        // list which can contain same datatypes = Array
        int[] marks = new int[3];
        marks[0] = 95;
        marks[1] = 92;
        marks[2] = 99;
        System.out.println(marks[2]);
        // o/p=99.

        // now if u consider maeks is not declared then it will have a value to be '0'
        // unlike c++ which has garbage value
        // marks[0]=92;
        // marks[1]=95; {if not declared}
        // marks[3]=99;
        System.out.println(marks);// o/p =0.

        // length
        System.out.println(marks.length);// o/p=3.

        // sort
        System.out.println(marks[0]);//op=95
        Arrays.sort(marks);
        System.out.println(marks[0]);//op=92


        //one dimentional array
        int[] marks ={97,98,95};

        int[][] finalmarks={{98,98,95}{90,96,91}}
        System.out.println(finalmarks[0][2]);//op=95 ~Deepindexing



    }

}
