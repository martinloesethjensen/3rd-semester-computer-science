package Exercise03_09_2018;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person
{
	private String name;
	private String cpr;

	public Person(String name, String cpr) {
		this.name = name;
		this.cpr = cpr;
	}

	public Person() {}

	public int calculateAge(String cpr)
	{
		String year = cpr.substring(4,6);

		//getting current date
		LocalDate localDate = LocalDate.now();
		//Getting pattern of the last two year digits
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy");
		//format DateTimeFormatter into string
		String now = localDate.format(formatter);

		if (Integer.parseInt(year) > Integer.parseInt(now))
		{
			year = "19" + year;
		}
		else
		{
			year = "20" + year;
		}

		String month = cpr.substring(2,4);

		String day = cpr.substring(0,2);

		//Parsing integers into LocalDate object
		LocalDate birth = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));

		return Period.between(birth, LocalDate.now()).getYears();
	}

	@Override
	public String toString() {
		return "Person{" +
			"name='" + name + '\'' +
			", cpr=" + cpr +
			'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpr() {
		return cpr;
	}

	public void setCpr(String cpr) {
		this.cpr = cpr;
	}
}
