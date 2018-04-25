
import edu.duke.*;

public class WordLengths {
    public static void main(String [] args) {
    	WordLengths wl = new WordLengths();
    	FileResource fr = new FileResource();
    	int [] ara;
    	ara = new int[15];
        ara[14] = 55;
        wl.countWordLengths(fr, ara);
    }
	
	void countWordLengths(FileResource resource, int [] count) {
		for(String s : resource.lines()) {
			StringBuilder str = new StringBuilder(s);
			int cn = 0;
			boolean wordStart = false;
			for(int i = 0; i < str.length() - 1; i++) {
				if(str.charAt(i+1) == ' ' || str.charAt(i+1) == ',' || str.charAt(i+1) == '.') {
				    
				    if(wordStart) {
				    	count[i-cn+1]++;
				    }
				    cn = i;
				    wordStart = false;
				}
				else 
					wordStart = true;
			}
		}
		for(int i = 1; i< 20; i++)
			System.out.println(count[i]);
	}
	
}
