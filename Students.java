package week3.day2;

public class Students {  
	
	public int getStudentInfo(int id)
	{
		return id;
	}
 public void getStudentInfo(int id,String name) {
       System.out.println("Enter id"+id+" "+"Enter Name"+name);
}
 public void getStudentInfo(String email,long phonenumber)
 {
	 System.out.println("Enter mail id"+email+" "+"Enter phone number"+phonenumber);
 }
 public static void main(String[] args) {
	Students st=new Students();
	st.getStudentInfo(10);
	st.getStudentInfo(456, "Lakshmi");
	st.getStudentInfo("abcd@gmail.com",455632178);
	
}
}
