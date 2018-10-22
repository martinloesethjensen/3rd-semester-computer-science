package MVC_DAT17C;

import MVC_DAT17C.model.Person;
import MVC_DAT17C.model.Student;
import MVC_DAT17C.model.Teacher;
import MVC_DAT17C.view.PersonView;

public class RunMe
{

	public static void main(String[] args)
	{
		Person s = new Student("alice", "1005892323");
		Person t = new Teacher("bob", "2312934545");

		System.out.println(PersonView.toJSON(s));
		System.out.println(PersonView.toJSON(t));
		System.out.println(PersonView.toHTML(s));
		System.out.println(PersonView.toHTML(t));
	}
}
