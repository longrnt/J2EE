class SingletonClass {
    private int a;
	private static SingletonClass cache;
	/** A private Constructor prevents any other class from instantiating. */
	private SingletonClass() {
		//	 Optional Code
		System.out.println("Abstract cache has been created.");
	}
	public static synchronized SingletonClass getSingletonObject() {
		if (cache == null) {
			cache = new SingletonClass();
		}
		
		
		return cache;
	}
	public synchronized int getA() {
        return a;
    }
    public synchronized void setA(int a) {
        this.a = a;
    }
    public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}

public class Singleton {

	public static void main(String args[]) throws CloneNotSupportedException {
		//		SingletonClass obj = new SingletonClass();
                //Compilation error not allowed
		SingletonClass obj = SingletonClass.getSingletonObject();
		
		obj.setA(123);
		
		SingletonClass obj2 = SingletonClass.getSingletonObject();
		
		System.out.println(obj2.getA());
		//Other processing
//		obj.clone(); //not allowed
		
		System.out.println("Singleton object obtained");
	}
}
