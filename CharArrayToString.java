package interview;
public class CharArrayToString {

	public static void main(String[] args) {
		char[] ch = {'g', 'o', 'o', 'd', ' ', 'm', 'o', 'r', 'n', 'i', 'n', 'g'};
		char[] ch1 = {'h', 'o', 'w', ' ', 'a', 'r', 'e', ' ','y', 'o', 'u'};
		String str=new String(ch);
		System.out.println(str);
		
		String str2 = String.valueOf(ch1);
	      System.out.println(str2);
	}

}
