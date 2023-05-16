package dependency_inversion;

public class DependencyInversion2 {
	public static void main(String[] args) {
		Person p = new Person();
		Email e = new Email();
		WeChat w = new WeChat();

		p.receive(e);

		p.receive(w);
	}
}

interface IReceiver {
	public String getInfo();
}

class Email implements IReceiver {
	@Override
	public String getInfo() {
		return "This is Email message: hello world";
	}
}

class WeChat implements IReceiver {
	@Override
	public String getInfo() {
		return "This is Wechat message from China";
	}
}

class Person {
	public void receive(IReceiver receiver) {
		String message = receiver.getInfo();
		System.out.println(message);
	}
}
