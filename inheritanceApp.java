 class Cal{
	public int sum(int v1, int v2) {
		return v1 + v2;
	}
	public int sum(int v1, int v2, int v3) {
//this는 자기자신!! 
		return this.sum(v1,v2) + v3;
	}
}

class Cal3 extends Cal{
	public int minus(int v1, int v2) {
		return v1 - v2;
	}
	public int sum(int v1, int v2) {
		System.out.println("Cal3!!");
//부모 클래스인 Cal의 sum을 가리킴 
		return super.sum(v1,v2);
	}
}

public class inheritanceApp {
	public static void main(String[] args) {
		Cal c = new Cal();
		System.out.println(c.sum(2,1));
		System.out.println(c.sum(2,1,1));

	Cal3 c3 = new Cal3();
		System.out.println(c3.sum(2, 1));
		System.out.println(c3.minus(2, 1));
		System.out.println(c3.sum(2, 1));
	}
}