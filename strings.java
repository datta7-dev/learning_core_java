import java.lang.String;

public class strings {
	public static void main(String args[]) {
		// in java the string is an continues sequence of characters;
		// character array is considered as a string;
		// these methods just returns the desired result, it does not make changes/
		// modify original string;

		char str[] = { 'd', 'a', 't', 't', 'a' };
		System.out.println(str); // as we know the char array is nothing but string,so we can print it directly.
		String name = "Datta", sirname = "Tandale";
		System.out.println(name + " " + sirname);
		System.out.println(name.charAt(0));// gives character at index;
		System.out.println(name.indexOf('D'));// gives index of character;
		System.out.println(name.length());// gives length of the string;
		System.out.println(sirname.substring(0, 3));// gives substring from starting index to end index given by user;
		System.out.println(sirname.contains("da"));// (case sensitive)return true if present else return false;
		System.out.println(sirname.equals(name));// (case sensitive)returns true if equal else return false;
		System.out.println(name.equalsIgnoreCase("datta"));// (not case sensitive)returns true if equal else return
															// false;
		System.out.println(name.concat(" " + sirname));// concat method is used for string concatenation;
		System.out.println(name.replace('D', 'd'));// replaces character;
		System.out.println(name.replace("Da", "da"));// replaces sequence of multiple characters;

		String str1 = "welcome to java programming";
		String str2[] = str1.split(" ");// split the string into array of strings;
		for (int i = 0; i < str2.length; i++) {
			System.out.println(str2[i]);
		}

		System.out.println(name.toUpperCase()); // convert string into upper case;
		System.out.println(name.toLowerCase()); // convert string into lower case;

		// convert number into string;
		int a = 7;
		System.out.println(String.valueOf(a));

		// string buffer, it provides some inbuilt methods to work with strings;
		StringBuffer newstr = new StringBuffer("datta tandale");
		System.out.println(newstr + " " + newstr.reverse());

		// string buider, it provides some inbuilt methods to work with strings;
		StringBuilder newstr1 = new StringBuilder("datta tandale");
		System.out.println(newstr1 + " " + newstr1.reverse());
	}
}
