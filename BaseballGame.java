public class BaseballGame {

	/*	
	Author: Louis Harris
	Date: 6/21/2018

	Description:
	Design a class named BaseballGame.
	*/

	// Declare instance variables.
	private String team1;
	private String team2;
	private Integer finalScore1;
	private Integer finalScore2;
	
	// Constructor.
	public BaseballGame(String teamName1, String teamName2, Integer score1, Integer score2) {
		setTeam1(teamName1);
		setTeam2(teamName2);
		setFinalScore1(score1);
		setFinalScore2(score2);
	}
	
	// Set team1.
	public void setTeam1(String teamName) {
		this.team1 = teamName;
	}
	
	// Get team1.
	public String getTeam1() {
		return this.team1;
	}
	
	// Set team2.
	public void setTeam2(String teamName) {
		this.team2 = teamName;
	}
	
	// Get team2.
	public String getTeam2() {
		return this.team2;
	}
	
	// Set finalScore1.
	public void setFinalScore1(Integer finalScore) {
		this.finalScore1 = finalScore;
	}
	
	// Get finalScore1.
	public Integer getFinalScore1() {
		return this.finalScore1;
	}
	
	// Set finalScore2.
	public void setFinalScore2(Integer finalScore) {
		this.finalScore2 = finalScore;
	}
	
	// Get finalScore2.
	public Integer getFinalScore2() {
		return this.finalScore2;
	}
	
	// Display game info.
	public void displayGameInfo() {
		
		System.out.println();
		
		System.out.println("____________________");
		
		System.out.println(team1 + ": " + finalScore1);
		System.out.println(team2 + ": " + finalScore2);
		
		System.out.println();
		
		if (finalScore1 > finalScore2) {
			System.out.println(team1 + " WON!");
		} else {
			System.out.println(team2 + " WON!");
		}
		
		System.out.println("____________________");
	}
	
}
