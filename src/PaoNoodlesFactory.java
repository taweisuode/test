import INoodles.INoodles;
import INoodles.INoodlesFactory;
import Noodles.PaoNoodles;
	
public class PaoNoodlesFactory extends INoodlesFactory{
	public INoodles create() {
		return new PaoNoodles() {
		};
	}
}
