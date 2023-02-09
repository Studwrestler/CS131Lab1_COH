import java.security.SecureRandom;
import java.util.Random;

/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author Chase
 * @version 1.3
 * Lab1
 * CS131ON
 */

public class NonPlayerCharacter extends GameCharacter{
	private boolean active; // active will determine if the character is online
	private String intelligenceType; // intelligenceType is used to determine the level of intelligence of the npc
	/**
	 * Initializes the npc as being as basic as possible such active being false and intelligence type average
	 */
	public NonPlayerCharacter() {
		GameCharacter g = new GameCharacter();
		this.active=false;
		this.intelligenceType="Average";
	}// end constructor
	/**
	 * Allows you to initialize id, personality, active, and intelligenceType
	 * @param id value is set by calling method
	 * @param personality value is set by calling method
	 * @param active value is set by calling method
	 * @param intelligenceType value is set by calling method
	 */
	public NonPlayerCharacter(String id, String personality, boolean active, String intelligenceType) {
		this.uniqueID=id;
		this.personality=personality;
		this.active=active;
		this.intelligenceType=intelligenceType;
	}//end constructor
	/**
	 * outputs your basic data
	 */
	public String reportStructure() {
		GameCharacter g = new GameCharacter();
		g.reportStructure();
		StringBuilder sb = new StringBuilder(g.reportStructure()+ "Active: "+getActive()+"\n");
		sb.append("Intelligence: "+getIntelligenceType()+"\n");
		sb.append("==================================\n");
		return sb.toString();
	}// end reportStructure
	/**
	 * introduces your self
	 * @return outputs you introducing yourself
	 */
	public String introduce() {
		StringBuilder sb = new StringBuilder("Hello, my name is "+getUniqueID());
		return sb.toString();
	}//end introduce
	/**
	 * Outputs a random text chat for the character to say
	 * @return returns one of the text chat options
	 */
	public String exclaim() {
		String[] exclaim = {"Dag Gummit","Doggone it", "Holy Cow", "Jeez","Well cheese and crackers"};
		Random r = new Random();
		int index = r.nextInt(exclaim.length);
		return exclaim[index];
	}//end exclaim
	/**
	 * Allow you to change if its active or not 
	 * @param active the new active value
	 */
	public void setActive(boolean active) {
		this.active=active;
	}//end setActive
	/**
	 * Outputs the current active value
	 * @return returns the current active value
	 */
	public boolean getActive() {
		return active;
	}//end getActive
	/**
	 * Allows you to change the level of Intelligence
	 * @param intelligenceType allows you to change Intelligence through calling method
	 */
	public void setIntelligenceType(String intelligenceType) {
		this.intelligenceType=intelligenceType;
	}//end setIntelligenceType
	/**
	 * gets the current Intelligence type
	 * @return returns the current Intelligence type
	 */
	public String getIntelligenceType() {
		return intelligenceType;
	}//end getIntelligenceType

}//end class
