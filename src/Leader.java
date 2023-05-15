import java.util.ArrayList;

public class Leader extends Employee {
  private ArrayList<Employee> employeeArrayList = new ArrayList<>();

  public Leader(String name, int age, double salary) {
    super(name, age, salary);
  }

  @Override
  public void add(Employee employee) {
    employeeArrayList.add(employee);
  }

  @Override
  public void remove(Employee employee) {
    employeeArrayList.remove(employee);
  }

  @Override
  public void print(int depth) {
    System.out.println("-".repeat(depth) + getName());
    for (Employee employee : employeeArrayList) {
      employee.print(depth + 2);
    }
  }
}
