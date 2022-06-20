package stringMethods;

import java.util.Arrays;

public class Methods {
 public static void main(String[] args) {
	System.out.println("unhappy".substring(2));
	System.out.println("unhappy".substring(3,6));
	
	String s = "javabykiran";
	String sub = s.substring(4, 7);
	System.out.println(sub);
	
	int index1 = s.indexOf('a');
	System.out.println(index1);
	
	int index2 = s.lastIndexOf('a');
	System.out.println(index2);
	
	String s1 = "jbk";
	char[] ch = s1.toCharArray();
	System.out.println(Arrays.toString(ch));
	
	String s2 = "Mr.Suraj";
	if(s2.startsWith("Mr.")) {
		System.out.println("male");
	}
		else {
			System.out.println("female");
		}
	
	String s3 = "My name is Suraj";
	System.out.println(s3.contains("is"));
	
	String s4 = "JBK";
	System.out.println(s4.equalsIgnoreCase("jbk"));
	System.out.println(s4.equals("jbk"));
	
	String s5 = "JAVA";
	System.out.println(s5.toLowerCase());
	
	String s6 = "java";
	System.out.println(s6.toUpperCase());
	
	
	String s7 = " ab c ";
	System.out.println(s7.trim());
	
	byte[] bytes = s7
			.getBytes();
	System.out.println(Arrays.toString(bytes));
	
	}
}

