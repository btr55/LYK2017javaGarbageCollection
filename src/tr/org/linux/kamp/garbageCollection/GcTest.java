package tr.org.linux.kamp.garbageCollection;

public class GcTest {
	
	int value;
	
	protected void finalize() throws Throwable {
		super.finalize();		//kalıtım
		System.out.println("Garbage collector çalıştı.");
		
	}

}
