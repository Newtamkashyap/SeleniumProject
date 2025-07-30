package introduction_project;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String gender = "Male";
	        int age = 21;
	        boolean voterCard = true;

	        if (gender=="Male" && age >= 21 && voterCard == true) {
	            System.out.println("Boy is Eligible");
	        } else if (gender=="Female" && age >= 18 && voterCard == true) {
	            System.out.println("Girl is Eligible");
	        } else {
	            System.out.println("Not Eligible");
	        }

	}

}
