import java.util.StringTokenizer;



/*
 * String class split():
 * String class also contains split() to split given
 * target string according to particular pattern
 * 
 * Note:Pattern Class split() can take target String as an
 * argument where as String class split() can take regular
 * expression as an argument
 * 
 * StringTokenizer:
 *  ->it is the specially designed class for Tokenization Activity
 *  ->this class is present in java.util Package
 *  
 * Note:The default Regular Expression of StringTokenizer is Space
 */
public class RegExDemo6 {

	
	public static void main(String[] args) {
		String s="Durga Software  Solutions";
		String s1[]=s.split("\\s+");
		for(String s2:s1){
			System.out.println(s2);
		}
		StringTokenizer st=new StringTokenizer("Durga Software  Solutions");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		StringTokenizer St=new StringTokenizer("21-07-1994","-");
		while(St.hasMoreTokens()){
			System.out.println(St.nextToken());
		}
	}

}
