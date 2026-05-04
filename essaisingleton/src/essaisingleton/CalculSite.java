package essaisingleton;

public class CalculSite {

	private static CalculSite instance;
	int nbclick;
	
	private CalculSite() {
		super();
	}
	
	public static CalculSite getInstance() {
		if (instance==null) {
			instance=new CalculSite();
		}
		return instance;
	}
	
	void click() {
		nbclick+=1;
	}
	
	void getclick() {
		System.out.println(nbclick);
	}
	
	
}
