package weekfour.monday.payroll.actions;

import weekfour.monday.payroll.models.Employee;
import weekfour.monday.payroll.models.Holiday;
import weekfour.monday.payroll.models.Payment;

import java.util.ArrayList;

public class Initialise {

    public ArrayList<Employee> seedData() {
        ArrayList<Employee> emps = new ArrayList<Employee>();
        emps.add(new Employee("Dean", "Lewis", "MD",
                37, "DL", "DL"));
        emps.get(0).getPayments().add(new Payment("12/05/2018", 2371.84f));
        emps.get(0).getPayments().add(new Payment("12/06/2018", 2145.12f));
        emps.get(0).getHolidays().add(new Holiday("01/06/2019", "14/06/2019", 10));


        emps.add(new Employee("Jackie", "Dowling", "HR",
                30, "JD", "JD"));
        emps.get(1).getPayments().add(new Payment("12/05/2018", 2371.84f));
        emps.get(1).getPayments().add(new Payment("12/06/2018", 2145.12f));
        emps.get(1).getHolidays().add(new Holiday("01/06/2019", "14/06/2019", 10));

        emps.add(new Employee("Gillian", "Porter", "Tester",
                16, "GP", "GP"));
        emps.get(2).getPayments().add(new Payment("12/05/2018", 2371.84f));
        emps.get(2).getPayments().add(new Payment("12/06/2018", 2145.12f));
        emps.get(2).getHolidays().add(new Holiday("01/06/2019", "14/06/2019", 10));

        emps.add(new Employee("John", "Deary", "Developer",
                20, "JD", "JD"));
        emps.get(3).getPayments().add(new Payment("12/05/2018", 2371.84f));
        emps.get(3).getPayments().add(new Payment("12/06/2018", 2145.12f));
        emps.get(3).getHolidays().add(new Holiday("01/06/2019", "14/06/2019", 10));

        return emps;

    }
}
