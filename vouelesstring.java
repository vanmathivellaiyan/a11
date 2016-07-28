package logicbuilding;

public class vouelesstring {
	public static void main(String[] args){
		StringBuffer str=new StringBuffer("reverceme");
		str.reverse();
		String str1=new String (str);
		System.out.println(str1);
	String	str2=str1.replaceAll("[aeiouAEIOU]","");
		System.out.println(str2);
	}

}
