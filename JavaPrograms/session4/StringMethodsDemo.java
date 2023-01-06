package session4;

public class StringMethodsDemo {

	public static void main(String[] args) {
		String str="action drama";
		//length() - is used to get the length of the string
		System.out.println(str.length());
		//charAt() - accepts an index number as an argument and returns 
		//the character at the given index number
		System.out.println(str.charAt(7));
		//concat() - is used for concatenating two strings
		System.out.println(str.concat(" comendy"));
		//substring()- it returns a specified part from the string
		//substring part will start from the startindex till endindex-1
		System.out.println(str.substring(7));
		System.out.println(str.substring(0,6));
		//contains() - is used to verify if the string contains the specified 
		//part of the string or not
		System.out.println(str.contains("drama"));
		//join() - it is used to join a group of strings
		System.out.println(String.join(" ","Have","a","nice","day"));
		//compareTo() - compares the given strings in the order of occurrence
		//in the dictionary
		String str1="Abc Xyz"; //A- 65
		String str2="Abc xyz";
		String str3="Xyz Abc"; //X- 88
		System.out.println(str1.compareToIgnoreCase(str2));
		System.out.println(str1.compareTo(str3));
		System.out.println(str3.compareTo(str1));
		//toUpperCase() toLowerCase()
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		//replace() - is used to replace all the specified character of the string
		//with another character
		System.out.println(str1.replace('A', 'D'));
		//format() - is used to format the string as per the passed argument
		String str4="India";
		System.out.println(String.format("Country: %s",str4));
	}

}
