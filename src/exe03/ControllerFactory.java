package exe03;

public class ControllerFactory {
	
	// Usa Reflection para analisar o tipo de Model e View recebidos e decidir qual Controlador criar
	public Controller newController(Model model, View view) throws Exception{
		//Cria StudentController
		if(model.getClass().getName().equals("exe03.Student")&&view.getClass().getName().equals("exe03.StudentView")){
			System.out.println("Fabricando StudentController");
			return new StudentController((Student) model,(StudentView) view);
		}
		// Cria ProfessorController
		if(model.getClass().getName().equals("exe03.Professor")&&view.getClass().getName().equals("exe03.ProfessorView")){
			System.out.println("Fabricando ProfessorController");
			return new ProfessorController((Professor) model,(ProfessorView) view);
		}		
		// Lança erro caso modelo e view sejam incompatíveis
		System.out.println("Model e View incompatíveis!");
		throw new Exception("Mismatched model and view!");
	}
}
