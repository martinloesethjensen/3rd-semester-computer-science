package MVC_DAT17C.controller;


import MVC_DAT17C.model.Person;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class PersonController {

    public static int calculateAge(String cpr)
    {
        String year;
        year = cpr.substring(4,6);

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
}
