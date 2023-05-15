public class Client {
  public static void main(String[] args) {
    Boss boss = new Boss("Boss", 50, 8000.0);
    Leader leader = new Leader("Leader", 40, 5000);


    BusinessAnalyst ba = new BusinessAnalyst("BA", 30, 2000);
    Developer dev1 = new Developer("Dev1", 25, 1000);
    Developer dev2 = new Developer("Dev2", 30, 1500);

    TTS t1 = new TTS("TTS-Dev-1", 20, 500);
    TTS t2 = new TTS("TTS-Dev-2", 21, 400);
    TTS t3 = new TTS("TTS-Ba-3", 22, 450);

    boss.add(leader);

    leader.add(dev1);
    leader.add(dev2);
    leader.add(ba);

    dev1.add(t1);
    dev2.add(t2);
    ba.add(t3);

    boss.print(0);

  }
}