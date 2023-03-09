
public class StaticKeyword {
	
			   int rollno;
			   String name;
			   static String college ;
			   static {
				   college="SIET TUMKURU";
			   }
			   StaticKeyword(int r,String n)
			   {
				   rollno=r;
				   name=n;
			   }
			   static void change() {
				   college ="SHRI DEVI INSTITUTE OF ENGINEERING AND TECHNOLOGY TUMKURU";
			   }
			   void display() {
				   System.out.println(rollno+" "+name+" "+college);
			   }
		
			StaticKeyword sb1 = new StaticKeyword(111,"ravi");
			StaticKeyword sb2 = new StaticKeyword(112,"sinra");
			sb1.display();
			change();
			sb2.display();

		}}



}
