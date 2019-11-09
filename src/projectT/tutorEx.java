package projectT;

public  abstract class tutorEx {
	
	public void commonDetails(String name ,int  emp_ID) {
//without abstract		
		System.out.println("Name :"+name);
		System.out.println("Emp_ID :"+emp_ID);
	}
	public  abstract void  confidencial_Info(int s);

}
