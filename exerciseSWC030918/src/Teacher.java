import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person
{
	public static int teacherCounter = 0;

	private String title;
	private List courses = new ArrayList();

	public Teacher(String name, String cpr) {
		super(name, cpr);
	}

	public Teacher(String title, String name, String cpr, List courses){
		super(name, cpr);
		this.courses = courses;
		this.title = title;
	}

	public Teacher(String name, String cpr, List courses){
		super(name, cpr);
		this.courses = courses;
	}

	public Teacher() {}

	@Override
	public String toString() {
		return "Teacher{" +
			"title='" + this.title + '\'' +
			super.toString() + "\n" +
			"courses=" + this.courses +
			'}';
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List getCourses() {
		return courses;
	}

	public void setCourses(List courses) {
		this.courses = courses;
	}
}
