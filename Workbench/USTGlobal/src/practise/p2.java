package practise;

public class p2 extends p1 {
	String Specilization;
	p2(String val){
		Specilization=val;
	}
	String Specilization() {
		return Specilization;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p2 b=new p2("brain");
		p2 b1=new p2("heart");
		b.age=45;
		System.out.println(b.age+""+b.Specilization);
		System.out.println(b1.age+""+b1.Specilization);

	}

}
