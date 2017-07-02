package exe03;

public class ProfessorView implements View {

	@Override
	public void printDetails(String professorName, String professorRollNo) {
		System.out.println("\nProfessor: ");
		System.out.println("Name: " + professorName);
		System.out.println("Roll No: " + professorRollNo);
	}
}
