/**
 * This class allows you to create a Basketball team that inherits from a Sports
 * team class to get all sort of percentages
 * 
 * @author Chase
 *
 */
public class BasketballTeam extends SportsTeam {
	private int fieldGoals;// amount of field goals made
	private int fieldGoalsAttempted;// amount of field goals shot
	private int freeThrows;// amount of free throws made
	private int freeThrowsAttempted;// amount of free throws attempted

	/**
	 * Allows you to create a basic team without any names or stats
	 */
	public BasketballTeam() {
		this.teamName = "";
		this.teamMascot = "";
		this.headCoach = "";
		this.wins = 0;
		this.losses = 0;
		this.fieldGoals = 0;
		this.fieldGoalsAttempted = 0;
		this.freeThrows = 0;
		this.freeThrowsAttempted = 0;
	}// end constructor

	/**
	 * Allows you to create Basketball team with names but no stats
	 * 
	 * @param teamName    allows you to set team name through calling method
	 * @param teamMascout allows you to set team mascout through calling method
	 * @param headCoach   allows you to set the head coach through calling method
	 */
	public BasketballTeam(String teamName, String teamMascout, String headCoach) {
		this.teamName = teamName;
		this.teamMascot = teamMascout;
		this.headCoach = headCoach;
		this.wins = 0;
		this.losses = 0;
		this.fieldGoals = 0;
		this.fieldGoalsAttempted = 0;
		this.freeThrows = 0;
		this.freeThrowsAttempted = 0;
	}// end constructor

	/**
	 * calculates the field goal percentage by using field goals and field goals
	 * made
	 * 
	 * @return the field goal percentage
	 */

	public double fieldGoalPercentage() {
		return (double) fieldGoals / fieldGoalsAttempted;
	}// end fieldGoalPercentage

	/**
	 * calculates the free throw percentage by using free throws and free throws
	 * made
	 * 
	 * @return the free throw percentage
	 */

	public double freeThrowPercentage() {
		return (double) freeThrows / freeThrowsAttempted;

	}// end freeThrowPercentage

	/**
	 * Outputs the stats of the basketball team
	 */

	public double[] getStats() {
		double[] Stats = { wins, losses, getWinPercentage(), fieldGoalPercentage(), freeThrowPercentage() };
		return Stats;
	}// end getStats

	/**
	 * Allows you to set the stats of your team
	 * 
	 * @param wins                allows you to set wins in calling method
	 * @param losses              allows you to set losses in calling method
	 * @param fieldGoals          allows you to set field goals made in calling
	 *                            method
	 * @param fieldGoalsAttempted allows you to set field goals attempted in calling
	 *                            method
	 * @param freeThrows          allows you to set free throws made in calling
	 *                            method
	 * @param freeThrowsAttempted allows you to set free throw attempts in calling
	 *                            method
	 */

	public void setStats(int wins, int losses, int fieldGoals, int fieldGoalsAttempted, int freeThrows,
			int freeThrowsAttempted) {
		this.wins = wins;
		this.losses = losses;
		this.fieldGoals = fieldGoals;
		this.fieldGoalsAttempted = fieldGoalsAttempted;
		this.freeThrows = freeThrows;
		this.freeThrowsAttempted = freeThrowsAttempted;
	}// end setStats
}//end class
