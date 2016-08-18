/*
 * character classes:
 * [abc]		either 'a' or 'b' or 'c'
 * [^abc]		except a b and c
 * [a-z]		any lower case alphabet symbol
 * [A-Z]		any upper case alphabet symbol 
 * [a-zA-Z]		any alphabet symbol
 * [0-9]		any digit from 0 to 9
 * [a-zA-Z0-9]	any alphanumeric symbol
 * [^a-zA-Z0-9]	except alphanumeric symbol(Special Characters)

*/
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegExDemo2 {

	
	public static void main(String[] args) {
		int cnt=0;
		Pattern p=Pattern.compile("[^0-9]");
		Matcher m=p.matcher("a7b@z#9");//matcher method is present in pattern class
		while(m.find()){
			cnt++;
			System.out.println(m.start()+"..."+m.group());
 		}
		System.out.println("total number of occurences:"+cnt);


	}

}
