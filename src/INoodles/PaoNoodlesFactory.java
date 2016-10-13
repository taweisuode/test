package INoodles;

import Noodles.PaoNoodles;

public class PaoNoodlesFactory extends INoodlesFactory{

	@Override
	public INoodles create() {
		return new PaoNoodles();
	}

}
