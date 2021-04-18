class Cal1{
	int v1,v2;
	Cal1(int v1, int v2){
		System.out.println("Cal init!!");
		this.v1 = v1; this.v2 = v2;
	}
	public int sum() {return this.v1+v2;}
}

//상속받은 클래스의부모가 생성자가 있다면, 자식은 반드시 부모 생성자를 실행시키도록 강제하고 있다.
class Cal4 extends Cal1{

	Cal4(int v1, int v2) {
		//부모클래스의 생성자 
		super(v1, v2);
		System.out.println("Cal4 init!!");
	}
	public int minus() {return this.v1-v2;}
}

public class inheritanceApp2 {
	public static void main(String[] args) {
		Cal1 c = new Cal1(2,1);
		Cal4 c3 = new Cal4(2,1);
		System.out.println(c3.sum()); //3
		System.out.println(c3.minus()); //1
	
		
		
	}
}