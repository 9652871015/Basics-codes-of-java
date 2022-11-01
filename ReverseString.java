package sample;

class ReverseString {
	public static void main (String[] args) {
		
		String str= "World", Rstr="";
		char ch;
		
	System.out.print("Original word: ");
	System.out.println("World"); //Example word
		
	for (int i=0; i<str.length(); i++)
	{
		ch= str.charAt(i); //extracts each character
		Rstr= ch+Rstr; //adds each character in front of the existing string
	}
	System.out.println("Reversed word: "+ Rstr);
	}
}

