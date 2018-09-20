package Exercise03_09_2018;
import java.util.List;
import java.util.ArrayList;

public class Course {
	private String courseTitle;
	private List students = new ArrayList();

	public Course(String courseTitle, List students) {
		this.courseTitle = courseTitle;
		this.students = students;
	}

	public Course(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	@Override
	public String toString() {
		return "Course{" +
			"courseTitle='" + courseTitle + '\'' +
			", students=" + students +
			'}' +"\n";
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public List getStudents() {
		return students;
	}

	public void setStudents(List students) {
		this.students = students;
	}
}
