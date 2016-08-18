/*
 * using Pattern class split():
 * we can use Pattern class split() to split the given target String
 * according to the given pattern
 */
import java.util.regex.Pattern;
public class RegExDemo5 {

	
	public static void main(String[] args) {
		Pattern p=Pattern.compile("\\s+");//except space everything is token here
		String s[]=p.split("Durga Software  Solutions");
		for(String s1:s){
			System.out.println(s1);
		}
		Pattern p1=Pattern.compile("a");//except a everything is token here
		String s1[]=p1.split("Durga Software  Solutions");
		for(String s2:s1){
			System.out.println(s2);
		}
		//special case
		Pattern P=Pattern.compile("\\.");//simply writing dot does print anything because dot will mean except any character 
		String S[]=P.split("www.durgasoft.com"); //alternatively use [.]
		for(String s3:S){
			System.out.println(s3);
		}
	}

}
