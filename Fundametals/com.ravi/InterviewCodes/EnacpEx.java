
public class EnacpEx {
        public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stu_id) {                        //getters and setters
		this.stu_id = stu_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		private int stu_id;
		private String name;
	public static void main(String[] args) {
		EnacpEx e1=new EnacpEx();
		System.out.println(e1.getName());
		System.out.println(e1.getStu_id());
		e1.setName("ravindra");
		e1.setStu_id(100);
		System.out.println(e1.getName());
		System.out.println(e1.getStu_id());
		
		

	}

}
