package Strategy_pattern;

public class Test {
    public static void main(String[] args) {
      Bowler spinbowler = new SpinBowler();
      IrishCricketTeam player1 = new Player1(spinbowler);
      player1.display();
      player1.bowl();
    }
}
