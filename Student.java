public class Student {

	protected int studentId;
	protected String name;
	protected double examFee;
	public Student(int studentId, String name, double examFee) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.examFee = examFee;
		
		if(studentId <= 0) {
			System.err.println("Student Id cannot be zero OR -ve");
		}
		if(name.isEmpty()) {
			System.err.println("Name cannot be null or blank");
		}
		if(examFee < 0) {
			System.err.println("Exam fees cannot be negative");
		}
	}
}
