package projectT;

public class tutDetails extends tutorEx{
	int salary;
	public void confidencial_Info(int s) {
		this.salary=s;
		System.out.println("Salary ="+salary);
	}
	public static void main(String[] args) {
		tutDetails tuts = new tutDetails();
		tuts.confidencial_Info(20000);
		tuts.commonDetails("Shravan", 23000);
	}
	

}
