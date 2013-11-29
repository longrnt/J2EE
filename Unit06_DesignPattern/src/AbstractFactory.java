
interface cache {
    void process();
}

interface CacheFactory {
	cache produceCache();
}

class ProduceFactory implements CacheFactory {
    public cache produceCache() {
        return new Cache1();
    }
}

class Cache1 implements cache {
    public void process() {
        System.out.println("Cache1 has been created...");
    }
}

class Cache2 implements cache {
    public void process() {
        System.out.println("Cache2 has been created...");
    }
}

class Computer {
	cache cache1;
 
    public Computer(CacheFactory factory) {
    	cache1 = factory.produceCache();
        cache1.process();
    }
}

class Client {
    public static void main(String[] args) {
        new Computer(createSpecificFactory());
    }
 
    public static CacheFactory createSpecificFactory() {
//        int sys = 0; // based on specific requirement
        return new ProduceFactory();
    }
}
