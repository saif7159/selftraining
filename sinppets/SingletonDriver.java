public class SingletonDriver{
	public static void main(String ... args){
		SingletonTest test = new SingletonTest();
		test.printXInc();
		test.printXInc();
		SingletonTest test1 = new SingletonTest();
		test1.printXInc();
	}
}