package Strategy_pattern;

public class Player2 extends IrishCricketTeam{
    public Player2(Bowler bowler, Batsman batsman) {
        super(bowler, batsman);
    }

    @Override
    public void display() {
        System.out.println("Player02");
    }


}
