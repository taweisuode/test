package Observer;

import java.util.Vector;

public abstract class Subject {
	private Vector<Observer> vector = new Vector<Observer>();
	public  void attach(Observer o) {
		vector.add(o);
	}
	public void detach(Observer o) {
		vector.remove(o);
	}
	protected void nodify(){
	  for(Observer o: vector){
          o.update();
      }
	}
	public abstract void dosomething();
}
