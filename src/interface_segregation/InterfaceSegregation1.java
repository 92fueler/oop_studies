package interface_segregation;

public class InterfaceSegregation1 {
	public static void main(String[] args) {
		B a = new B();

		a.operation1();
		a.operation3();
		a.operation4();

		D c = new D();

		c.operation1();
		c.operation5();
	}
}

interface interface1 {
	void operation1();

	void operation2();

	void operation3();

	void operation4();

	void operation5();
}

class B implements interface1 {
	@Override
	public void operation1() {
		System.out.println("This is class B operation 1");
	}

	@Override
	public void operation3() {
		System.out.println("This is class B operation 3");
	}

	@Override
	public void operation4() {
		System.out.println("This is class B operation 4");
	}

	@Override
	public void operation5() {
		System.out.println("This is class B operation 5");
	}

	@Override
	public void operation2() {
		throw new UnsupportedOperationException("Unimplemented method 'operation2'");
	}
}

class D implements interface1 {
	@Override
	public void operation1() {
		System.out.println("This is class D operation 1");
	}

	@Override
	public void operation4() {
		throw new UnsupportedOperationException("Unimplemented method 'operation4'");
	}

	@Override
	public void operation5() {
		System.out.println("This is class D operation 5");
	}

	@Override
	public void operation2() {
		throw new UnsupportedOperationException("Unimplemented method 'operation2'");
	}

	@Override
	public void operation3() {
		throw new UnsupportedOperationException("Unimplemented method 'operation3");
	}

}