import java.util.Objects;

public class Student extends Person
{
	public static int studentCounter = 0;

	private int studentNumber;
	private double gradeTotal = 0;
	private int gradeCounter = 0;
	//private int[] grades = new int[gradeCounter];

	public double getAverage()
	{
		return gradeTotal / gradeCounter;
	}

	public void addGrade(int grade)
	{
		gradeTotal += grade;
		gradeCounter++;
	}

	public Student(String name, String cpr, int studentNumber){
		super(name, cpr);
		this.studentNumber = studentNumber;
		studentCounter++;
	}

	public Student(String name, String cpr) {
		super(name, cpr);
		studentCounter++;
	}

	public Student() {
	}

	@Override
	public boolean equals(Object student)
	{
		return studentNumber == ((Student) student).studentNumber;
	}

	@Override
	public String toString() {
		return "Student{" +
			super.toString() +
			", student number=" + this.studentNumber +
			'}';
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public double getGradeTotal() {
		return gradeTotal;
	}

	public void setGradeTotal(double gradeTotal) {
		this.gradeTotal = gradeTotal;
	}
}
