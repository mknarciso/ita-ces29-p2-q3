package exe03;

public class ProfessorController implements Controller {
	private Professor model;
	private ProfessorView view;
	public ProfessorController(Professor model, ProfessorView view) {
		this.model = model;
		this.view = view;
	}
	@Override	
	public void setName(String name) {
		model.setName(name);
	}
	@Override
	public String getName() {
		return model.getName();
	}
	@Override
	public void setRollNo(String rollNo) {
		model.setRollNo(rollNo);
	}
	@Override
	public String getRollNo() {
		return model.getRollNo();
	}
	@Override
	public void updateView() {
		view.printDetails(model.getName(), model.getRollNo());
	}
}
