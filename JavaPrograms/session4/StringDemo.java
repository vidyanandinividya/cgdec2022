package session4;

public class StringDemo {

	public static void main(String[] args) {
		/*String str1="CG";
		String str2="CG";
		String str3="cg";
		String str4="xyz";
		System.out.println(str1==str2);//true
		System.out.println(str1==str3); //false
		System.out.println(str1==str4); //false
		System.out.println(str1.equals(str2));//true
		System.out.println(str1.equals(str3));//false
		System.out.println(str1.equals(str4));//false*/
		String str1=new String("CG");
		String str2=new String("CG");
		String str3=new String("cg");
		String str4=new String("xyz");
		System.out.println(str1==str2);//false
		System.out.println(str1==str3); //false
		System.out.println(str1==str4); //false
		System.out.println(str1.equals(str2));//true
		System.out.println(str1.equals(str3));//false
		System.out.println(str1.equals(str4));//false
		

	}

}
