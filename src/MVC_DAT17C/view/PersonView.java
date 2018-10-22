package MVC_DAT17C.view;

import MVC_DAT17C.controller.PersonController;
import MVC_DAT17C.model.Person;

public class PersonView
{

	public static String toJSON(Person p)
	{
		String result = "{\n";
		result += "\t\"name\": \"" + p.getName() + "\",\n";
		result += "\t\"cpr\": \"" + p.getCpr() + "\",\n";
		result += "\t\"age\": " + PersonController.calculateAge(p.getCpr()) + "\n";
		result += "}";
		return result;
	}

	public static String toHTML(Person person)
	{
		return "<!DOCTYPE html>\n<html>\n<body>\n" +
				"\t<h1>Name: " + person.getName() + "<h1>\n" +
				"\t<h1>Cpr: " + person.getCpr() + "<h1>\n" +
				"\t<h1>Age: " + PersonController.calculateAge(person.getCpr()) + "<h1>\n" +
				"\t<h1>Exam(" + person.getClass().toString().substring(23) + "): " + person.doExam() + "<h1>\n" +
				"</body>\n</html>";
	}
}
