package _06_duck;

public class AnimalRunner {
	public static void main(String[] args) {
		Duck daffy = new Duck("donuts",5);
		daffy.quack();
		AnAnimal floof = new AnAnimal(1, 1);
		floof.eat();
		floof.sleep();
	}
}
