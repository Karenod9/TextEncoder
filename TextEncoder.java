/* Instantiable class to encode sentences based on a number of rules
Author @ Karen O Donoghue 20144148 - NCIRL HDSDEV-SEP CA - Question 2A - 05.12.2020
*/

public class TextEncoder{
	//declare data members
	private String text;
	private String encodedText;

	//declare default constructor
	public TextEncoder (){
		text = null;
		encodedText = null;
	}

	//Setter method to store input from user in instance variable text
	public void setText(String text){
		this.text = text;
	}

	//Getter method to return encoded text to app class when invoked
	public String getEncodedText(){
		return encodedText;
	}

	//processing
	//declare method to implement the processing
	public void compute(){
		//declare and create StringBuffer
		StringBuffer sb = new StringBuffer(text);

		//traverse the input from the end to the beginning.
		for (int i = text.length()-1; i>=0; i--){
			//retrieve the current character
			char c = text.charAt(i);
			//Check if current character is a vowel if so add ** before the character
			if(c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U'){
				sb.insert(i, "**");//invoke methods on the StringBuffer obj via sb
			//Check if current character is a consonant if so add space before the character
			}else if ((c>='a'&&c<='z') || (c>='A'&&c<='Z')){
				sb.insert(i, " ");
			//Check if current character is a fullstop if so do nothing
			}else if(c == '.'){
				sb.append("");
			//Check if current character is space if so, replace with a hyphen
			}else if(c == ' '){
				sb.deleteCharAt(i);
				sb.replace(i,i,"-");
			}
		}
		//convert back to a string.
		encodedText = sb.toString();
	}
}