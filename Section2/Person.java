package Section2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Person {

        private int id;
        private String name;
        private int age;
        private String gender;
        private Date dateOfBirth;
        private String email;
        private long salary;
        private boolean employed;
        private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

        // Constructor
        public Person(int id, String name, int age, String gender, Date dateOfBirth, String email
                , long salary, boolean employed) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.dateOfBirth = dateOfBirth;
            this.email = email;
            this.salary = salary;
            this.employed = employed;
        }

        // Convert Date to String
        public static String dateToString(Date date) {
            return dateFormat.format(date);
        }

        // Convert String to Date
        public static Date stringToDate(String dateString) throws ParseException {
            return dateFormat.parse(dateString);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    ", gender='" + gender + '\'' +
                    ", dateOfBirth=" + dateToString(dateOfBirth) +
                    ", email='" + email + '\'' +
                    ", salary='" + salary + '\'' +
                    ", employed=" + employed +
                    '}';
        }
    }



