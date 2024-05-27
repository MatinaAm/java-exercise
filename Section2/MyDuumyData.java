package Section2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class MyDuumyData {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        try {
            persons.add(new Person(1, "متینا امان نژاد", 30, "زن", Person.stringToDate("1372/07/18"), "matina.amani@gmail.com", Long.MAX_VALUE, true));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // نمایش داده‌ها
        for (Person person : persons) {
            System.out.println("my dummy data is :" + person);
        }
    }


}
