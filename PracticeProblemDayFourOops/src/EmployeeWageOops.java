import java.util.Random;

abstract class Employee {
    String name;
    int id;
    int salPerHour = 20;


    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract int calculateSalary(int hours);
}


class FullTimeEmployee extends Employee {
    FullTimeEmployee(String name, int id) {
        super(name, id);
    }

    @Override
    int calculateSalary(int hours) {
        return hours * salPerHour;
    }
}

class PartTimeEmployee extends Employee {
    PartTimeEmployee(String name, int id) {
        super(name, id);
    }

    @Override
    int calculateSalary(int hours) {
        return hours * salPerHour;
    }
}

class Attendance{
      private boolean present;

      public void setAttendance(boolean present){
          this.present=present;
        }

        public boolean isPresent() {
          return present;
        }
    }

public class EmployeeWageOops{
    public static void main(String args[]){

        System.out.println("Welcome to Employee Wage Computation Program");

        Employee employee;
        Attendance attendance = new Attendance();

        employee = new FullTimeEmployee("Ram", 101);

        attendance.setAttendance(true);

        if (attendance.isPresent()) {
            int workingHours = 8;
            int dailySalary = employee.calculateSalary(workingHours);

            System.out.println("Employee Name: " + employee.name);
            System.out.println("Employee ID: " + employee.id);
            System.out.println("Working Hours: " + workingHours);
            System.out.println("Daily Salary: " + dailySalary);
        } else {
            System.out.println("Employee is Absent");
        }
    }
}