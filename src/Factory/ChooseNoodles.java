package Factory;

public class ChooseNoodles {
	public static void main(String[] args) {
		System.out.println("单方法静态工厂");
		INoodles myINoodles = NoodlesFactory.createNoodles(3);
		myINoodles.desc();
		System.out.println("多方法静态工厂－－常用");
		INoodles myNoodles = NoodlesFactory.createLZ();
		myNoodles.desc();
		INoodles myNoodles2 = NoodlesFactory.createPao();
		myNoodles2.desc();
		System.out.println("普通工厂");
		INoodles myIINoodles = new LZNoodlesFactory().create();
		myIINoodles.desc();
		INoodles myIINoodles2 = new PaoNoodlesFactory().create();
		myIINoodles2.desc();
		
	}
}
