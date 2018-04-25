public class Part3{
    public static void main(String [] args) {
    	Part3 pt = new Part3();
    	pt.testing();
    }
	public boolean twoOccurrences(String stringa, String stringb) {
		int count = 0;
		count = stringb.indexOf(stringa,count);
		if(count == -1) return false;
		count = stringb.indexOf(stringa,count+1);
		if(count == -1) return false;
		return true;
	}
	public static String lastPart(String a, String b){
		int index = b.indexOf(a);
		if(index == -1)
			return b;
		
		return (b.substring(index + a.length(), b.length()));
	}
	
    void  testing() {
    	System.out.println(twoOccurrences("ab", "abbbab"));
    	System.out.println(twoOccurrences("atg", "ctgtatgta"));
    	String a = "an";
		String b = "banana";
		System.out.println(lastPart(a,b));
		
		a = "zoo";
		b = "forest";
		System.out.println(lastPart(a,b));
    }
}