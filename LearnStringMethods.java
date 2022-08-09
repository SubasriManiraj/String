package week4day1;

public class LearnStringMethods {
public static void main(String[] args) {
	//to convert a string into lowercase
	String text1="Testleaf";
	
	String lowercase=text1.toLowerCase();
	System.out.println(lowercase);
	
	//to convert a string into uppercase
	String uppercase=text1.toUpperCase();
	System.out.println(uppercase);
	
	//delete spaces(doen't delete inbetween spaces
	String S1="         hello world     ";
	
	String trim=S1.trim();
	System.out.println(trim);
	
	//to add two Strings,int,float,long etc
	String t1="Test";
	String t2="Leaf";
	String t3=t1+t2;
	System.out.println(t3);
	
	//to add only two Strings
	String concat=t1.concat("Chennai");
	System.out.println(concat);
	
	//to replace certain character
	String name="All is well";
	String replace=name.replace('l', '@');
	System.out.println(replace);
	
	//to replace entire character instead of certain character
	String text2="testleaf1234is12";
	String replaceAll=text2.replaceAll("\\D", ""); //to replace digital="\\D"
	String replacetext=text2.replaceAll("\\a-z", ""); //to replace alphabet
	System.out.println(replacetext);
	System.out.println(replaceAll);
	
	//to get a value started from index 
	String data="Testleaf";
	String substring=data.substring(4);
	System.out.println(substring);
	
	//to get a value in between index
	CharSequence subSequence=data.subSequence(3, 8);
	System.out.println(subSequence);
	
	String data1="testleaf";
	String data2="TestLeaf";
	
	//to check both value is equal(doesn't include cases) 
	boolean equalsIgnorecase=data1.equalsIgnoreCase(data2);
	System.out.println(equalsIgnorecase);
	
	//to check both value is equal(includes cases, space)
	boolean equals=data1.equals(data2);
	System.out.println(equals);
	
	//to get certain string in given variable
	String name3="Testleaf in Chennai";
	boolean contains=name3.contains("Chennai");
	System.out.println(contains);
	
	//to find the value of index
	String dataLength="Test";
	int indexOf=dataLength.indexOf('s');
	System.out.println(indexOf);
	
	//to check the variable is empty or not
	boolean empty=dataLength.isEmpty();
	System.out.println(empty);
	
	String word="I like India";
	String[] split=word.split(" ");
	for (int i=0; i< split.length; i++) {
		System.out.println(split[i]);
	}
}
}
