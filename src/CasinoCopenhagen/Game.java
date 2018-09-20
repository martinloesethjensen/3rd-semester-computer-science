package CasinoCopenhagen;

import java.util.ArrayList;
import java.util.HashMap;

public class Game {
	private Tournament tournament;

	private ArrayList<Game> games = new ArrayList<>();
	private ArrayList<User> players = new ArrayList<>();
	private ArrayList<User> winners = new ArrayList<>();

	private HashMap<Tournament, ArrayList<User>> playersOfTournaments = new HashMap<>();
	private HashMap<Tournament, ArrayList<User>> winnersOfTournaments = new HashMap<>();

	public Game() {}

	public Game(Tournament tournament, ArrayList<Game> games, ArrayList<User> players, ArrayList<User> winners,
	            HashMap<Tournament, ArrayList<User>> playersOfTournaments,
	            HashMap<Tournament, ArrayList<User>> winnersOfTournaments)
	{
		this.tournament = tournament;
		this.games = games;
		this.players = players;
		this.winners = winners;
		this.playersOfTournaments = playersOfTournaments;
		this.winnersOfTournaments = winnersOfTournaments;
	}



	public Tournament getTournament() {
		return tournament;
	}

	public void setTournament(Tournament tournament) {
		this.tournament = tournament;
	}

	public ArrayList<Game> getGames() {
		return games;
	}

	public void setGames(ArrayList<Game> games) {
		this.games = games;
	}

	public ArrayList<User> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<User> players) {
		this.players = players;
	}

	public ArrayList<User> getWinners() {
		return winners;
	}

	public void setWinners(ArrayList<User> winners) {
		this.winners = winners;
	}

	public HashMap<Tournament, ArrayList<User>> getPlayersOfTournaments() {
		return playersOfTournaments;
	}

	public void setPlayersOfTournaments(HashMap<Tournament, ArrayList<User>> playersOfTournaments) {
		this.playersOfTournaments = playersOfTournaments;
	}

	public HashMap<Tournament, ArrayList<User>> getWinnersOfTournaments() {
		return winnersOfTournaments;
	}

	public void setWinnersOfTournaments(HashMap<Tournament, ArrayList<User>> winnersOfTournaments) {
		this.winnersOfTournaments = winnersOfTournaments;
	}
}
