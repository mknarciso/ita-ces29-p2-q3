package exe03;

public class StudentView implements View {
	@Override
	public void printDetails(String studentName, String studentRollNo) {
		System.out.println("\nStudent: ");
		System.out.println("Name: " + studentName);
		System.out.println("Roll No: " + studentRollNo);
	}
}
