import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo9 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("input.txt"));
		PrintWriter out=new PrintWriter("output.txt");
		
		Pattern p=Pattern.compile("(0|91)?[7-9][0-9]{9}");
		String line=br.readLine();
		while(line!=null){
		    Matcher m=p.matcher(line);
		    while(m.find()){
		    	out.println(m.group());
		    	System.out.println(m.group());
		    }
		    line=br.readLine();
		}
	}

}
