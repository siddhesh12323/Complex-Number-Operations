
public class Complex1 {
	private int real1, img1;
	
	Complex1() {
		
	}
	
	Complex1(int real1, int img1) {
		this.setReal1(real1);
		this.setImg1(img1);
	}
	
	static void addition(Complex1 c1, Complex1 c2) {
		Complex1 c3 = new Complex1();
		c3.setReal1(c1.getReal1() + c2.getReal1());
		c3.setImg1(c1.getImg1() + c2.getImg1());
		display(c3);
	}
	
	static void subtraction(Complex1 c1, Complex1 c2) {
		Complex1 c3 = new Complex1();
		c3.setReal1(c1.getReal1() - c2.getReal1());
		c3.setImg1(c1.getImg1() - c2.getImg1()); 
		display(c3);
	}
	
	static void multiplication(Complex1 c1, Complex1 c2) {
		Complex1 c3 = new Complex1();
		c3.setReal1((c1.getReal1() * c2.getReal1()) - (c1.getImg1() * c2.getImg1()));
		c3.setImg1((c1.getImg1() * c2.getReal1()) + (c1.getReal1() * c2.getImg1()));
		display(c3);
	}
	
	static void division(Complex1 c1, Complex1 c2) {
		Complex1 c3 = new Complex1();
		c3.setReal1(((c1.getReal1() * c2.getReal1()) + (c1.getImg1() * c2.getImg1())) / ((c2.getReal1() * c2.getReal1()) + (c2.getImg1() * c2.getImg1())));
		c3.setImg1(((c1.getImg1() * c2.getReal1()) - (c1.getReal1() * c2.getImg1())) / ((c2.getReal1() * c2.getReal1()) + (c2.getImg1() * c2.getImg1())));
		display(c3);
	}
	
	static void display(Complex1 c3) {
		System.out.println(c3.getReal1() + " + " +c3.getImg1() + "i");
	}

	public int getReal1() {
		return real1;
	}

	public void setReal1(int real1) {
		this.real1 = real1;
	}

	public int getImg1() {
		return img1;
	}

	public void setImg1(int img1) {
		this.img1 = img1;
	}

}
