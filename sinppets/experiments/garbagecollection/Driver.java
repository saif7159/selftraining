package garbagecollection;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class Driver {
    public void checkGCOperation() {
        Employee e = new Employee(123, "Garbage",
                LocalDate.parse("24/02/1997", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(e);
    }

    public static void main(String... args) {
        new Driver().checkGCOperation();
        Employee e1 = new Employee(123, "Saif",
                LocalDate.parse("24/02/1997", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        Employee e2 = new Employee(345, "Ranjit",
                LocalDate.parse("16/02/1996", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        Employee e3 = new Employee(431, "Ram",
                LocalDate.parse("21/05/1994", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        Employee e4 = new Employee(4331, "Anoy",
                LocalDate.parse("06/12/1990", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        Map<Employee, String> map = new HashMap<>();
        map.put(e1, "Microsoft");
        map.put(e2, "Delloitte");
        map.put(e3, "Amazon");
        map.put(e4, "Cognizant");

        Employee eNew = new Employee(123, "Saif",
                LocalDate.parse("24/02/1997", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        Employee eNew1 = new Employee(123, "Saif",
                LocalDate.parse("24/02/1997", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        map.put(eNew, "Google");
        System.out.println(map.get(eNew1));
        map.entrySet().forEach(System.out::println);
        System.gc();
    }
}
