/*Application to Encode a text input from user using TextEncoder IC
Author @ Karen O Donoghue 20144148 - NCIRL HDSDEV-SEP CA - Question 2A - 05.12.2020
*/

//import Scanner to take input from user
import java.util.Scanner;

public class TextEncoderApp{
	public static void main(String[] args){
		//declare local variables
		String inputText;
		//declare + create obj type Scanner
		Scanner input = new Scanner(System.in);
		//declare + create obj type TextEncoder
		TextEncoder encoder = new TextEncoder();

		//take input from user
		System.out.println("Enter text to be encoded: ");
		//assign input to inputText variable
		inputText = input.nextLine();
		//send inputText to IC for processing
		encoder.setText(inputText);

		//invoke compute method from TextEncoder class
		encoder.compute();

		//Retrieve encoded text from IC class
		String newText = encoder.getEncodedText();
		//output encoded text.
		System.out.println("Encoded text: " + newText);
	}
}