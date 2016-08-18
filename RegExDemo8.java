import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Write a regular expression to check whether the given number is a valid mobile number or not
 */
public class RegExDemo8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Pattern p=Pattern.compile("(0|91)?[7-9][0-9]{9}");
		String s=br.readLine();
		Matcher m=p.matcher(s);
		if(m.find()&&m.group().equals(s)){
			System.out.println("Valid mobile number");
			
		}
		else{
			System.out.println("Not a valid mobile number");
			
		}
	}

}
