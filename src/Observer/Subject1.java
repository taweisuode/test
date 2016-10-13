package Observer;

public class Subject1 extends Subject{

	@Override
	public void dosomething() {
		System.out.println("我要获取2个观察者的age");
        this.nodify();
	}

}
