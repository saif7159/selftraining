public class SingletonTest{
	// private static SingletonTest obj;
	private static int x = 5;
	{
		System.out.println("Im Default constructor");
	}
	static {
		System.out.println("I load at class load time");
	}
	// public static SingletonTest getInstance(){
	// 	if(obj == null) {
	// 		obj = new SingletonTest();
	// 	}
	// 	return obj;
	// }

	public void printXInc(){
		System.out.println(x);
		x++;
	}
}