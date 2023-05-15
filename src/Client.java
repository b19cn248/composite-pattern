public class Client {
  public static void main(String[] args) {
    Boss boss = new Boss("Boss", 50, 8000.0);
    BusinessAnalyst ba = new BusinessAnalyst("BA", 30, 3000);

    Leader leader = new Leader("Leader", 40, 5000);
    Developer dev1 = new Developer("Dev", 25, 1000);
    Developer dev2 = new Developer("Dev", 30, 1500);

    leader.add(dev1);
    leader.add(dev2);
    boss.add(leader);
    boss.add(ba);

    boss.print(0);

  }
}