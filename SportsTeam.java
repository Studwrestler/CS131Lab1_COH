/**
 * This is the base Sports team object from which all other teams will be
 * derived.
 * 
 * @author Chase Hall
 */
public abstract class SportsTeam {
	protected String teamName;// will be used to name team
	protected String teamMascot;// will be used to designate a mascot
	protected String headCoach;// will be used to designate a head coach
	protected int wins; // will be used to take amount of wins
	protected int losses;// will be used to take amount of losses

	/**
	 * Allows you to create a Sports team without a name, mascot, head coach or win
	 * or loss counts
	 */

	public SportsTeam() {
		this.teamName = "";
		this.teamMascot = "";
		this.headCoach = "";
		this.wins = 0;
		this.losses = 0;
	}// end constructor

	/**
	 * Allows you to create a sports team with name, mascot, and head coach but
	 * without wins or losses
	 * 
	 * @param teamName allows you to set team name through calling method
	 * @param teamMascot allows you to set team mascot through calling method
	 * @param headCoach allows you to set the head coach through calling method
	 */

	public SportsTeam(String teamName, String teamMascot, String headCoach) {
		this.teamName = teamName;
		this.teamMascot = teamMascot;
		this.headCoach = headCoach;
		this.wins = 0;
		this.losses = 0;

	}//end constructor
	/**
	 * calculates the win percentage by using wins and losses
	 * @return the win percentage
	 */
	public double getWinPercentage() {
		return (double) wins / (wins + losses);
	}//end getWinPercentage
	/**
	 * creates a blank double Stats array and returns it
	 * @return a blank stats array
	 */
	public double[] getStats() {
		double[] Stats = null;
		return Stats;
	}//end getStats
	/**
	 * Allows you to retrieve team name
	 * @return the team name
	 */

	public String getTeamName() {
		return teamName;
	}//end getTeamName
	/**
	 * Allows you to set team name through calling method
	 * @param teamName used in calling method to set name
	 */

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}//end setTeamName
	/**
	 * Allows you to retrieve team mascot
	 * @return the team mascot
	 */

	public String getTeamMascot() {
		return teamMascot;
	}//end getTeamMascot
	/**
	 * Allows you to set team mascot through calling method
	 * @param teamMascot used in calling method to set mascot
	 */

	public void setTeamMascot(String teamMascot) {
		this.teamMascot = teamMascot;
	}//end setTeamMascot
	/**
	 * Allows you to retrieve the head coach
	 * @return the head coach 
	 */

	public String getHeadCoach() {
		return headCoach;
	}//end getHeadCoach
	/**
	 * Allows you to set the head coach through calling method
	 * @param headCoach used in calling method to set the head coach
	 */

	public void setHeadCoach(String headCoach) {
		this.headCoach = headCoach;
	}//end setHeadCoach
	/**
	 * Allows you to retrieve amount of wins
	 * @return the amount of wins
	 */

	public int getWins() {
		return wins;
	}//end getWins
	/**
	 * Allows you to set the number of wins through calling method
	 * @param wins used in calling method to set the amount of wins
	 */

	public void setWins(int wins) {
		this.wins = wins;
	}//end setWins
	/**
	 * Allows you to retrieve amount of losses
	 * @return the amount of losses
	 */

	public int getLosses() {
		return losses;
	}//end getLosses
	/**
	 *  Allows you to set the number of losses through calling method
	 * @param losses used in calling method to set the amount of losses
	 */

	public void setLosses(int losses) {
		this.losses = losses;
	}//end setLosses

}//end class
