package br.com.override;

public class Override1 {

	public static void main(String[] args) {
		Base b = new Base2();
		System.out.println(b.getValue()); // 3
	}

}

class Base {
	public Object getValue() {
		return new Object();
	} // 1
}

class Base2 extends Base {
	public String getValue() { // An overridden method may have a more specific return type
								//Object -> String is more specific -> dont work to primitives
		return "hello";
	} // 2
}
