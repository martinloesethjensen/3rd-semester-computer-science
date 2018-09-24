package CasinoCopenhagen;

import java.util.ArrayList;
import java.util.HashMap;

public class Game {
	private Tournament tournament;

	private ArrayList<Game> games = new ArrayList<>();
	private ArrayList<User> players = new ArrayList<>();
	private ArrayList<User> winners = new ArrayList<>();

	//cannot contain dublicate keys with hashmap... //id?
	private HashMap<Integer, ArrayList<User>> playersOfTournaments = new HashMap<>();
	private HashMap<Integer, ArrayList<User>> winnersOfTournaments = new HashMap<>();

	public Game() {}

	public Game(Tournament tournament) {
		this.tournament = tournament;
	}

	//add another constructor that takes in GameType


	@Override
	public String toString() {
		return "Game{" +
			"tournament=" + tournament +
			", games=" + games +
			", players=" + players +
			", winners=" + winners +
			", playersOfTournaments=" + playersOfTournaments +
			", winnersOfTournaments=" + winnersOfTournaments +
			'}';
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

	public HashMap<Integer, ArrayList<User>> getPlayersOfTournaments() {
		return playersOfTournaments;
	}

	public void setPlayersOfTournaments(HashMap<Integer, ArrayList<User>> playersOfTournaments) {
		this.playersOfTournaments = playersOfTournaments;
	}

	public HashMap<Integer, ArrayList<User>> getWinnersOfTournaments() {
		return winnersOfTournaments;
	}

	public void setWinnersOfTournaments(HashMap<Integer, ArrayList<User>> winnersOfTournaments) {
		this.winnersOfTournaments = winnersOfTournaments;
	}
}
