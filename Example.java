class Example {
	static void m1(){
	System.out.println("Example m1 method");
	}
	void m2(){
	System.out.println("Example m2 method");
	}
	void m3(){
	System.out.println("Example m3 method");
	}
	void m4(){
	System.out.println("Example m4(no parameter)");
	}

     }
class Sample extends Example{
	static void m1(){
	System.out.println("Sample m1 method");
	}
	void m2(){
	System.out.println("Sample m2 method");
	}
	void m3(String s){
	System.out.println("Sample m3(String parameter)");
	}
	public static void main(String args[]){
	Sample s=new Sample ();
	s.m1();
	s.m2();
	s.m3();
	s.m4();
	//s.m4("UK");
	
	Example e=new Sample();
	e.m1();
	e.m2();
	e.m3();
	e.m4();
	//e.m4("UK");
	}
}