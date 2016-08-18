import java.util.regex.Matcher;
import java.util.regex.Pattern;


class RegExDemo {

	public static void main(String[] args) {
		int cnt=0;
		Pattern p=Pattern.compile("ab");
		Matcher m=p.matcher("ababbaba");//matcher method is present in pattern class
		while(m.find()){
			cnt++;
			System.out.println(m.start()+"..."+m.end()+"..."+m.group());
		}
		System.out.println("total number of occurences:"+cnt);

	}

}
