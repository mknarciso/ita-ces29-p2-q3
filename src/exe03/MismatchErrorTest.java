package exe03;

import static org.junit.Assert.*;

import org.junit.Test;

public class MismatchErrorTest {
	// fetch student record based on his roll no from the database
	Student model = MVCPatternDemo.retriveStudentFromDatabase();
	Professor model2 = MVCPatternDemo.retriveProfessorFromDatabase();
	
	// Create a view : to write student details on console
	StudentView view = new StudentView();
	ProfessorView view2 = new ProfessorView();
	
	// Testa os Erros de model e view não compatíveis
	ControllerFactory fc = new ControllerFactory();
	@Test(expected = Exception.class)
	public void mismatch1() throws Exception {
		Controller controller = fc.newController(model, view2);
	}
	@Test(expected = Exception.class)
	public void mismatch2() throws Exception {
		Controller controller2 = fc.newController(model2, view);
	}
}
