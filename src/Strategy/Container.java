package Strategy;

public class Container {
	private CalePriceStrategy strategy;
	public Container(CalePriceStrategy calePriceStrategy) {
		this.strategy = calePriceStrategy;
	}
	public double getCountPrice(double price) {
		return strategy.calePrice(price);
	}
}
