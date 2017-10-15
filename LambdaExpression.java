package javalamdabasics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExpression {
	public static void main(String[] args) {
		List<Players> people = Arrays.asList(
				new Players("Mashrafe","Mortplayersuza",37),
				new Players("Musfikur","Rahim",36),
				new Players("Shakib","Hasan",35),
				new Players("Mostafizur","Rahman",22),
				new Players("Tamim","Iqbal",35)
				);
	    printConditionally(people, new Condition(){
	    	//@Override
	    	public boolean test(Players p) {
	    		return p.getAge()>29;
	    	}
	    });
	   
	}
	 private static void printConditionally(List<Players>people, Condition condition){
			for(Players p:people)
				if(condition.test(p)){
			     	System.out.println("Name : " + p.getFirstName() + " " + p.getLastName() + " ; Age: " + p.getAge());
				}
	}
}
interface Condition{
	boolean test(Players p);
	
}
