import java.io.*;
import java.util.*;

public class BaseballGameTest {

	public static void main(String[] args) {
		
		Console c = System.console();
		Scanner in = new Scanner(System.in);
		
		//BaseballGame game;
		BaseballGame[] games;
		
		String team1;
		String team2;
		Integer score1;
		Integer score2;
		
		String separator = "______________________________";
		
		/*
		game = new BaseballGame();
		game.setTeam1("Phillies");
		game.setTeam2("Yankees");
		game.setFinalScore1(9);
		game.setFinalScore2(1);
		
		game.displayGameInfo();
		*/
		
		games = new BaseballGame[5];
		
		for (Integer i = 0; i < games.length; i++) {
			System.out.println();
			System.out.println(separator);
			
			System.out.println("Game " + (i + 1) + "\n");
			
			team1 = c.readLine("Enter Team 1: ");
			System.out.print("Enter " + team1 + " score: ");
			score1 = in.nextInt();
			System.out.println();
			
			team2 = c.readLine("Enter Team 2: ");
			System.out.print("Enter " + team2 + " score: ");
			score2 = in.nextInt();
			System.out.println(separator);
			
			/*
			games[i] = new BaseballGame();
			games[i].setTeam1(team1);
			games[i].setTeam2(team2);
			games[i].setFinalScore1(score1);
			games[i].setFinalScore2(score2);			
			*/
			
			games[i] = new BaseballGame(team1, team2, score1, score2);
		}		
		
		for (Integer i = 0; i < games.length; i++) {
			games[i].displayGameInfo();
		}
	}
	
}