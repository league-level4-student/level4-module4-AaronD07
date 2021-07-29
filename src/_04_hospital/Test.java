package _04_hospital;

public class Test {
	public class Dog {
		public void act() {
		System.out.print("run");
		eat();
		}
		public void eat() {
		System.out.print("eat");
		}
		}public class UnderDog extends Dog {
		public void act() {
		super.act();
		System.out.print("poop");
		}
		public void eat() {
		super.eat();
		System.out.print("bark");
		}
		}
		Dog fido = new UnderDog();


}
