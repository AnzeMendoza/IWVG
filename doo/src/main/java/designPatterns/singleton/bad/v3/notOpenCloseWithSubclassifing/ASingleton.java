package designPatterns.singleton.bad.v3.notOpenCloseWithSubclassifing;

public class ASingleton extends Singleton {

	
	protected ASingleton(){
		super();
	}
	
	public void m() {
		System.out.println("Ejecuci�n de m de ASingleton");
	}
}
