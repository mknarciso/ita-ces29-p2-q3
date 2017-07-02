package exe03;

public class MVCPatternDemo {
	public static void main(String[] args) throws Exception {

		// fetch student record based on his roll no from the database
		Student model = retriveStudentFromDatabase();
		Professor model2 = retriveProfessorFromDatabase();
		
		// Create a view : to write student details on console
		StudentView view = new StudentView();
		ProfessorView view2 = new ProfessorView();
		
		// Factory cria os controladores apropriados
		ControllerFactory fc = new ControllerFactory();
		Controller controller = fc.newController(model, view);
		Controller controller2 = fc.newController(model2, view2);
		
		// Test for Student
		controller.updateView();
		// update model data
		controller.setName("John");
		controller.updateView();

		// Test for Professor
		controller2.updateView();
		// update model data
		controller2.setName("William");
		controller2.updateView();	
		controller2.setRollNo("02");
		controller2.updateView();	
	}

	static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}
	static Professor retriveProfessorFromDatabase() {
		Professor prof = new Professor();
		prof.setName("Marcus");
		prof.setRollNo("01");
		return prof;
	}	

}
