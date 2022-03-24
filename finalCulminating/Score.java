package finalCulminating;

public class Score {
	public int score = -1;
	public String playerName = "-1"; //debug to see if anything went wrong
	
	public Score(int _score, String _playerName){
		score = _score;
		playerName = _playerName;
	}
	
	public String ToString() {
		return score + ":" + playerName;
	}
}
