public class Hosteller extends Student{
	protected double hostelFee;

	public Hosteller(int studentId, String name, double examFee, double hostelFee) {
		super(studentId, name, examFee);
		this.hostelFee = hostelFee;
	}

	@Override
	public String toString() {
		return "Hosteller [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + ", hostelFee="
				+ hostelFee + "]";
	}
	
	public double payFee(double amount) {
		double totalFeesPaid = this.examFee + this.hostelFee;
		return totalFeesPaid - amount;	
	}

}
