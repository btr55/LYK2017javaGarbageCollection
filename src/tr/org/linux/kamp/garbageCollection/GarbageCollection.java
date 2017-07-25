package tr.org.linux.kamp.garbageCollection;

public class GarbageCollection {

	public static void main(String[] args) throws Throwable {
		Runtime rt=Runtime.getRuntime();
		System.out.println("Garbage collector çalışmadan önce:"+rt.freeMemory());
		String str=new String("Linux Yaz kampı");	//şu an bir referansı var. garbage col. temizlemez
		String str1=new String("Java Programlama");
		System.out.println(str);
		str=str1;		//str nin içini değiştirerek işaret ettiği yeri değiştik. 
						//"Artık Linux Yaz Kampı"nın referansı yok. silinecek.
		str=null;
		//System.gc();//garbage collectoru çağırdık. işi bitince silecek. kendisi karar veriyor.
		GcTest gcTest=new GcTest();
		gcTest.value=1;
		gcTest=null;
		System.gc();
		//gcTest.finalize();
		System.out.println("Garbage collector çalıştıktan sonra:"+rt.freeMemory());
	}
}
