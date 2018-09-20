package Exercise03_09_2018;
import java.util.ArrayList;
import java.util.List;

public class Populate
{
	public static void main(String[] args)
	{
		List<Student> students = new ArrayList<>();
		List<Course> courses = new ArrayList<>();

		/*
		 * Populate lists
		 */
		Course technology = new Course("TECH03", students);
		Course math = new Course("Math", students);
		Course algorithm = new Course("Algorithm", students);
		Course design = new Course("Design", students);

		courses.add(technology);
		courses.add(math);
		courses.add(algorithm);
		courses.add(design);

		Student student01 = new Student("Mads", "1234567890", 12);
		Student student02 = new Student("Morten", "1234567890", 13);
		Student student03 = new Student("Mikkel", "1234567890", 14);
		Student student04 = new Student("Peter", "1234567890", 12);

		students.add(student01);
		students.add(student02);
		students.add(student03);
		students.add(student04);

		Teacher teacher = new Teacher("Mr.","John", "1234567890", courses);

		//print teacher
		System.out.println(teacher);

		//Check equals between two students studentNumber... should be true
		System.out.println(student01.equals(student04));

		//print average grade for student01
		student01.addGrade(12);
		student01.addGrade(6);
		System.out.println(student01.getAverage());
	}
}
