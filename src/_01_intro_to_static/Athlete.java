package _01_intro_to_static;


public class Athlete {
    static int nextBibNumber = 1;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";

    
    
    
    String name;
    int speed;
    int bibNumber;

    Athlete (String name, int speed){
    	
    	
    	
    	bibNumber = nextBibNumber; 
    	
    	nextBibNumber +=1;
    	
        this.name = name;
        this.speed = speed;
    }

    public static void main(String[] args) {
        //create two athletes
        //print their names, bibNumbers, and the location of their race. 
    	
    	Athlete athlete = new Athlete("athlete", 4);
    	System.out.println(athlete.name);
    	System.out.println(athlete.speed);
    	System.out.println(athlete.bibNumber);
    	
    	Athlete john = new Athlete("john", 4);
    	System.out.println(john.name);
    	System.out.println(john.speed);
    	System.out.println(john.bibNumber);
    			
    	
    }
}




