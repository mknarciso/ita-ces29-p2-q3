package exe03;

public class StudentController implements Controller {
	private Student model;
	private StudentView view;

	public StudentController(Student model, StudentView view) {
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