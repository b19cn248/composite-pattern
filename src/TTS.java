public class TTS extends Employee {

  public TTS(String name, int age, double salary) {
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
