
/**
 * The purpose of this program is to illustrate the use of keyboard
 * input methods of the Scanner class.
 * 
 * �FLVS 2007
 * @author B. Jordan 
 * @version 03/05/07
 */
import java.util.Scanner;
public class KeyboardInput_v1
{
    public static void main(String [ ] args)
    {
        //construct a Scanner object with two lines
        Scanner in;
        in = new Scanner(System.in);
	    
        //use the nextInt() method to enter an integer value
        System.out.print("Please enter an integer value:  ");
        int intValue = in.nextInt();
        System.out.println("You entered: " + intValue);
        System.out.println();
        
    }
}
