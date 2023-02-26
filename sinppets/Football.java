import java.util.*;
public class Football implements Comparable<Football>{
	private int age;
	private int goals;

	public Football(int age, int goals){
		this.age = age;
		this.goals = goals;
	}

	public int getAge(){
		return age;
	}

	public int getGoals(){
		return goals;
	}

	public int compareTo(Football football){
		return this.goals - football.getGoals();
	}

}