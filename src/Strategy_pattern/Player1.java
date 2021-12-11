package Strategy_pattern;

public class Player1 extends IrishCricketTeam{


    public Player1(Bowler bowler, Batsman batsman) {
        super(bowler, batsman);
    }

    @Override
    public void display() {
        System.out.println("Player01");
    }
}