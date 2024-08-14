package Interface;

public class Test implements I2{
	@Override
	public void m1() {
			System.out.println("IT wroks!!");

	}
	@Override
	public void m2() {
		System.out.println("It works too!!");
		
	}
	public static void main(String[] args) {
		I1 i = new Test();
		i.m1();
		System.out.println(i.x);
		
		I2 ii = new Test();
		ii.m1();
		ii.m2();
		
		Test t = new Test();
		t.m1();
		t.m2();	

		
	}
}

