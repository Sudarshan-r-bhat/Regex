import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo10 {

	
	public static void main(String[] args) {
		int cnt=0;
		Pattern p=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_$.]*[.]txt");
		File f=new File("/home/m4n15h/Desktop/workspace/Regex");
		String s[]=f.list();
		for(String s1:s){
		    Matcher m=p.matcher(s1);
		    if(m.find()&&m.group().equals(s1)){
		    	cnt++;
		    	System.out.println(s1);
		    }
		    
		}
		System.out.println("the total number of files:"+cnt);
	}

}
