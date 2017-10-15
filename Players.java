package javalamdabasics;

public class Players {
    private String firstName;
    private String lastName;
    private int age;
    public Players(String fN, String lN,int a) {
    	super();
    	this.firstName = fN;
    	this.lastName = lN;
    	this.age = a;
    }
    public String getFirstName() {
    	return firstName;
    }
    public String getLastName() {
    	return lastName;
    }
    public int getAge() {
    	return age;
    }
    public String toString() {
    	return "Person [First Name = " + firstName + "] [ Last Name = " + lastName  +"[ Get Age = " + age;
    }
}
