
/**
 * This is the Application object that will launch our application
 * @author Chase Hall
 * @version 1.3
 * Lab1 
 * CS131ON
 */
public class Application {
	/**
	 * Default
	 */
	Application(){
		
	}
/**
 * Main loop of application
 * @param args arguments of main method
 */

	public static void main(String[] args) {
		
		NonPlayerCharacter npc = new NonPlayerCharacter();

		System.out.println(npc.reportStructure());
		System.out.println(npc.introduce());
		System.out.println(npc.exclaim());

	}//end main

}//end class