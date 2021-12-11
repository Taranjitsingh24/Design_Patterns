package Strategy_pattern;

public class Test {
    public static void main(String[] args) {
     Batsman toporderbatsman = new TopOrderBatsman();
     Batsman middleorderbatsman = new MiddleOrderBatsman();
     Bowler fastbowler = new FastBowler();
     Bowler spinbowler = new SpinBowler();
     IrishCricketTeam player1 = new Player1(fastbowler,toporderbatsman);
        IrishCricketTeam player2 = new Player2(spinbowler,middleorderbatsman);
     player1.display();
     player1.bat();
     player1.bowl();
     System.out.println("\n");
     player2.display();
     player2.bat();
     player2.bowl();


    }
}
