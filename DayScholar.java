public class DayScholar extends Student {

	protected double transportFee;

	public DayScholar(int studentId, String name, double examFee, double transportFee) {
		super(studentId, name, examFee);
		this.transportFee = transportFee;
	}

	@Override
	public String toString() {
		return "DayScholar [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + ", transportFee="
				+ transportFee + "]";
	}
	
	public double payFee(double amount) {
		double totalFeesPaid = this.examFee + this.transportFee;
		return totalFeesPaid - amount;	
	}
}
