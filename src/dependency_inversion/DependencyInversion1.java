package dependency_inversion;

public class DependencyInversion1 {
	public static void main(String[] args) {
		Person1 p = new Person1();

		p.receive(new Email());
	}
}

class Person1 {
	public void receive(Email email) {
		email.getInfo();
	}
}

class Email {
	public void getInfo() {
		System.out.println("This is the info.");
	}
}