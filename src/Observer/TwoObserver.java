package Observer;

public class TwoObserver extends Observer{

	@Override
	public void update() {
		
		System.out.println("观察者2的age为13");
	}
	public void getName() {
		System.out.println("观察者2的name为lisa");
	}
}