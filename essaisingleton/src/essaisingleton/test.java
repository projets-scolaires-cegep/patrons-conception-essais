package essaisingleton;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculSite A=CalculSite.getInstance();
		A.click();
		A.click();
		A.click();
		A.getclick();
		CalculSite B=CalculSite.getInstance();
		B.click();
		B.click();
		B.getclick();
		
		System.out.println(A==B);
		
		
	}

}
