package INoodles;

import Noodles.BanNoodles;
import Noodles.LZNoodles;
import Noodles.PaoNoodles;

public class NoodlesFactory {
	private static final int LZ = 1;
	private static final int PAO = 2;
	private static final int BAN = 3;
	//单方法的静态工厂实现
	public static INoodles createNoodles(int type) {
		switch (type) {
		case LZ:
			return new LZNoodles();
		case PAO:
			return new PaoNoodles();
		case BAN:
			return new BanNoodles();
		default:
			break;
		}
		return null;
	}
	//多方法的静态工厂实现
	public static INoodles createLZ() {
		return new LZNoodles();
	}
	public static INoodles createPao() {
		return new PaoNoodles();
	}
	public static INoodles createBan() {
		return new BanNoodles();
	}
}
