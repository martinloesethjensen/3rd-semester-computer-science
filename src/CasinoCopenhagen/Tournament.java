package CasinoCopenhagen;

import java.util.ArrayList;

public class Tournament {
	private int tournamentId = 0;
	private String tournamentName;
	private double prizeToWin;
	private final double MIN_AMOUNT = 0.1;
	private double amountToEnter = prizeToWin - (prizeToWin * MIN_AMOUNT);
	private ArrayList<Tournament> tournaments = new ArrayList<>();

	public Tournament() {
	}

	public Tournament(String tournamentName, double prizeToWin, double amountToEnter) {
		this.tournamentName = tournamentName;
		this.prizeToWin = prizeToWin;
		this.amountToEnter = amountToEnter;
		this.tournamentId++;
	}

	@Override
	public String toString() {
		return "Tournament{" +
			"tournamentName='" + tournamentName + '\'' +
			", prizeToWin=" + prizeToWin +
			", amountToEnter=" + amountToEnter +
			'}';
	}

	public int getTournamentId() {
		return tournamentId;
	}

	public void setTournamentId(int tournamentId) {
		this.tournamentId = tournamentId;
	}

	public ArrayList<Tournament> getTournaments() {
		return tournaments;
	}

	public void setTournaments(ArrayList<Tournament> tournaments) {
		this.tournaments = tournaments;
	}

	public String getTournamentName() {
		return tournamentName;
	}

	public void setTournamentName(String tournamentName) {
		this.tournamentName = tournamentName;
	}

	public double getPrizeToWin() {
		return prizeToWin;
	}

	public void setPrizeToWin(double prizeToWin) {
		this.prizeToWin = prizeToWin;
	}

	public double getMIN_AMOUNT() {
		return MIN_AMOUNT;
	}

	public double getAmountToEnter() {
		return amountToEnter;
	}

	public void setAmountToEnter(double amountToEnter) {
		this.amountToEnter = amountToEnter;
	}
}
