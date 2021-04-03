class Test {

	int k;
	double d;
	float f;
	boolean istrue;
	String p;

	public void printValue() {
		System.out.println("int default value = "+ k);
		System.out.println("double default value = "+ d);
		System.out.println("float default value = "+ f);
		System.out.println("boolean default value = "+ istrue);
		System.out.println("String default value = "+ p);
	}
}

/*Implement a Java program to check default values of the Datatypes*/
/*class DefaultValue{


	public static void main(String[] args) 
	{
		/*static char a;
		static byte b;
		static short c;
		static int d;
		static long e;
		static float f;
		static double g;*/

		int a;

		/*System.out.println("Default value of char="+a);
		System.out.println("default value of byte="+b);
		System.out.println("default value of short="+c);
		
		System.out.println("default value of long="+e);
		System.out.println("default value of float="+f);
		System.out.println("default value of double="+g);*/

		System.out.println("value of int="+a);



public class DefaultValue {
	public static void main(String argv[]) {
		Test test = new Test();
		test.printValue();
	}
} 
}