
/**
 *Catherine Zeng 7-9-13
 *The purpose of this program is to try out strings with text message abbreviations
 *
 */
public class TextMessageV1
{
	public static void main(String[ ] args)
	{
	    //input output 1
	    String originalMessage = "Oh my gosh you are so funny!! I just laughed out loud. Hey I've got to go, talk to you later!";
	    System.out.println("Original Message:");
	    System.out.println(originalMessage);
	    int originalMessageLength = originalMessage.length();
	    System.out.println("message length: " + originalMessageLength);
	    System.out.println();
	   	
	    //replace characters within the String object
	    String newMessage = originalMessage.replace("Oh my gosh", "omg");
	    newMessage = newMessage.replace("you are", "ur");
	    newMessage = newMessage.replace("laughed out loud", "loled");
	    newMessage = newMessage.replace("I've got to go", "I g2g");
	    newMessage = newMessage.replace("talk to you later", "ttyl");
	    System.out.println("New Message:");
	    System.out.println(newMessage);
	    int newMessageLength = newMessage.length();
	    System.out.println("message length: " + newMessageLength);
	    System.out.println();
	    
	    //string method samples
	    System.out.println("String Method Samples:");
	    
	    //index of
	    int indexOfG=newMessage.indexOf('g');
	    System.out.println("indexof \"g\":     " + indexOfG);
	    
	    //substring
	    int quarterPoint=newMessageLength/4;
	    int threeQuarterPoint=newMessageLength/4*3;
	    String firstQuarter=newMessage.substring(0,quarterPoint);
	    String fourthQuarter=newMessage.substring(threeQuarterPoint);
	    System.out.println("substring (1st quarter of message:two parameters):    "+firstQuarter);
	    System.out.println("substring (4th quarter of message:one parameter):    "+fourthQuarter);
	    
	    //replace all
	    String replacingLetters=newMessage.replaceAll("[lgtnu]","*");
	    System.out.println("replaceAll letters l,g,t,n,and u with *:     "+replacingLetters);
	    
	   
	    
	    
	    

	}//end of main method
}//end of class