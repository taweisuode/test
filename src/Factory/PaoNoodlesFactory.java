package Factory;
import Factory.INoodles;
import Factory.INoodlesFactory;
import Factory.PaoNoodles;
	
public class PaoNoodlesFactory extends INoodlesFactory{
	public INoodles create() {
		return new PaoNoodles() {
		};
	}
}
