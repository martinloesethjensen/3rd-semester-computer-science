package MVC_DAT17C.model;

public class Teacher extends Person
{


	public Teacher(String name, String cpr)
	{
		super(name, cpr);
	}

	@Override
	public String doExam()
	{
		return "I will ask the questions.";
	}
}
