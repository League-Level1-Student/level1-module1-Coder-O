package _06_duck;

public class AnAnimal {
	int health;
	int friendliness;
	
	AnAnimal(int health, int friendliness){
		this.health = health;
		this.friendliness = friendliness;
	}
	
	void sleep() {
		System.out.println("ZZZZZ");
	}
	void eat() {
		System.out.println("Animal has eaten.");
	}
}
