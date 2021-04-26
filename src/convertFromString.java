
public class convertFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="22";
		
		int i=Integer.parseInt(s);
		long l=Long.parseLong(s);
		float f=Float.parseFloat(s);
		double d=Double.parseDouble(s);
		
		
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		
		
		Integer ii=Integer.valueOf(s);
		Long ll=Long.valueOf(s);
		Float ff=Float.valueOf(s);
		Double dd=Double.valueOf(s);
		System.out.println(ii);
		System.out.println(ll);
		System.out.println(ff);
		System.out.println(dd);
		
		

	}

}
