package Strategy_pattern;

public abstract class IrishCricketTeam {
  Bowler bowler;
  Batsman batsman;

public IrishCricketTeam(Bowler bowler, Batsman batsman){
  this.bowler = bowler;
  this.batsman = batsman;
}
public void setBowler(Bowler bowler){
  this.bowler = bowler;
}
  public void setBatsman(Batsman batsman){
    this.batsman = batsman;

  }
public void bowl(){
  bowler.bowl();
}
  public void bat(){
    batsman.bat();
  }
public abstract void display();


}
