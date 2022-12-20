public class Casting {
    public static void main(String[] args){
        //casting

        //implicit casting
        double price = 100.00;
        double finalPrice = price + 18;//here 18 is an integer but there is no data loss{implicit conversion}   while converting int to double.
        System.out.println(finalPrice);//o/p=118
        
        //error
        int p =100;
        int fp =p+18.0; //error we cannot convert higher priority datatype to a lesser one there will be data loss

        //explicit casting
        int pZ =100;
        int fpZ =p+(int)18.11;//we have converted double to int by  type casting
        //O/P=118

    }
    
}
//Ravindra H V