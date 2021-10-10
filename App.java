package hw1;

public class App {
	//HW1 Was used principle L — Liskov Substitution
	public static void main(String[] args) {
		BoxPolymorph ib1 = new BoxPolymorph(100);
		BoxPolymorph ib2 = new BoxPolymorph("Hello");
		BoxPolymorph ib3 = new BoxPolymorph(10.8);
		System.out.println(ib1.getValue());
		System.out.println(ib2.getValue());
		System.out.println(ib3.getValue());
		BoxOverloadi ib11 = new BoxOverloadi(100);
		BoxOverloadS ib12 = new BoxOverloadS("Hello");
		BoxOverloadd ib13 = new BoxOverloadd(10.8);
		System.out.println(ib11.value);
		System.out.println(ib12.value);
		System.out.println(ib13.value);
	}
	

}
//class Box overloading
class BoxOverloadi {
	int value;
	BoxOverloadi (int value){
		this.value = value;
	}
}
class BoxOverloadd {
	double value;
	BoxOverloadd (double value){
		this.value = value;
	}
}
class BoxOverloadS {
	String value;
	BoxOverloadS (String value){
		this.value = value;
	}
}

//class Box polymorphism inheritance 
class BoxPolymorph {
	private Object value;
	BoxPolymorph (Object value){
		setValue(value);
	}
	
	public Object getValue() {
		return value;
	}
	
	public void setValue(Object value) {
		this.value = value;
	}
}


