import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Quantifiers : We can use Quantifiers to specify number of occurences to match
 * a	exactly one a
 * a+	atleast one a
 * a*	any number of a's including zero number also
 * a?	atmost one a
 */
public class RegExDemo4 {

	public static void main(String[] args) {
		int cnt=0;
		Pattern p=Pattern.compile("a*");
		Matcher m=p.matcher("abaabaaab");//matcher method is present in pattern class
		while(m.find()){
			cnt++;
			System.out.println(m.start()+"..."+m.group());
 		}
		System.out.println("total number of occurences:"+cnt);



	}

}
