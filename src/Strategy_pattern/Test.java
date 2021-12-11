package Strategy_pattern;

public class Test {
    public static void main(String[] args) {
      Bowler spinbowler = new SpinBowler();
      Bowler fastbowler = new FastBowler();
      IrishCricketTeam player1 = new Player1(spinbowler);
      player1.display();
//      player1.bowl();
      player1.setBowler(fastbowler);
      player1.bowl();
    }
}
