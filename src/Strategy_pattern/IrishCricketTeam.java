package Strategy_pattern;

public abstract class IrishCricketTeam {
  Bowler bowler;

public IrishCricketTeam(Bowler bowler){
  this.bowler = bowler;
}
public void setBowler(Bowler bowler){
  this.bowler = bowler;
}
public void bowl(){
  bowler.bowl();
}
public abstract void display();
}
