public abstract class Employee {
  private String name;
  private int age;
  private double salary;

  public Employee() {
  }

  public Employee(String name, int age, double salary) {
    this.name = name;
    this.age = age;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public abstract void add(Employee employee);

  public abstract void remove(Employee employee);

  public abstract void print(int depth);
}
