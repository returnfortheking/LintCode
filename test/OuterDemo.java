package test;

interface Inter { void show(); }
class Outer { 
	public static Inter method()
{
	return new Inter(){
		public void show() {
			System.out.println("helloworld");
		}
	};
	}
 }
class OuterDemo {
    public static void main(String[] args) {
	      Outer.method().show();
	  }
}