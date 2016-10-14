package Observer;

public class Client {
	public static void main(String[] args) {
		Subject1 subject1 = new Subject1();
		OneObserver observer = new OneObserver();
		subject1.attach(observer);
		subject1.attach(new TwoObserver());
		subject1.dosomething();
	}
}
