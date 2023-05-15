public class BusinessAnalyst extends Employee {
  public BusinessAnalyst(String name, int age, double salary) {
    super(name, age, salary);
  }

  @Override
  public void add(Employee employee) {

  }

  @Override
  public void remove(Employee employee) {

  }

  @Override
  public void print(int depth) {
    System.out.println("-".repeat(depth) + getName());
  }
}
