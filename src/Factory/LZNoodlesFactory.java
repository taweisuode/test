package Factory;

public class LZNoodlesFactory extends INoodlesFactory{
	@Override
	public INoodles create() {
		return new LZNoodles();
	}
}
