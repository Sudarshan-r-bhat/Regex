/*
 * Pre Defined Character Classes
 * \s	space character
 * \S	except space character any character
 * \d 	any digit [0-9]
 * \D 	any character except digit
 * \w	any word character [any alphanumeric character][a-zA-z0-9]
 * \W	except word character (Special Character)
 * .	any symbol including special character also
 * 
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegExDemo3 {

	public static void main(String[] args) {
		int cnt=0;
		Pattern p=Pattern.compile("\\s");
		Matcher m=p.matcher("a7b  k@9");//matcher method is present in pattern class
		while(m.find()){
			cnt++;
			System.out.println(m.start()+"..."+m.group());
 		}
		System.out.println("total number of occurences:"+cnt);



	}

}
