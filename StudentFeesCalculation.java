import java.util.Scanner;

public class StudentFeesCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select a particular type of Student :");
		System.out.println("1) Hosteller Student :");
		System.out.println("2) DayScholer Student :");
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1 : System.out.println("You have selected Hosteller!!!");
		System.out.print("Enter Student Id :");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Student Name :");
		String name = sc.nextLine();
		System.out.print("Enter Exam Fees :");
		double fee = sc.nextDouble();
		System.out.print("Enter Hostel Fee :");
		double hostelFee = sc.nextDouble();
		
		Hosteller hosteller = new Hosteller(id, name, fee, hostelFee);
		
		System.out.print("Enter your total Fees :");
		double totalFees = sc.nextDouble();
		double amt = hosteller.payFee(totalFees);
		
		if(amt<0) {
			System.out.println("Refundabale Amount is :"+amt);
			System.out.println(hosteller);
		}
		else {
			System.out.println("Payable Amount is :"+amt);
			System.out.println(hosteller);
		}
		break;
		
		case 2 : System.out.println("You have selected Day Scholler!!!");
		System.out.print("Enter Student Id :");
		int d_id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Student Name :");
		String d_name = sc.nextLine();
		System.out.print("Enter Exam Fees :");
		double d_fee = sc.nextDouble();
		System.out.print("Enter Transport Fee :");
		double TransportFee = sc.nextDouble();
		
	    DayScholar dayscholar = new DayScholar(d_id, d_name, d_fee, TransportFee);
		
		System.out.print("Enter your total Fees :");
		double d_totalFees = sc.nextDouble();
		double d_amt = dayscholar.payFee(d_totalFees);
		
		if(d_amt<0) {
			System.out.println("Refundabale Amount is :"+d_amt);
			System.out.println(dayscholar);
		}
		else {
			System.out.println("Payable Amount is :"+d_amt);
			System.out.println(dayscholar);
		}
		
	
		}

	}

}
