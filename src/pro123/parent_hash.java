package pro123;

public  class parent_hash extends main {
	 int Fees;
	public void tutor_fees(int a) {
		this.Fees = a; 
	}
	public static void main(String[] args) {
		parent_hash hash = new parent_hash();
		hash.tutor_fees(500);
		
		System.out.println("I am in Main Subclass");
		
	}
	@Override
	void tutor_hours() {
		
		
	}
	@Override
	void student_fees() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void parent_fees() {
		// TODO Auto-generated method stub
		
	}
	

}
