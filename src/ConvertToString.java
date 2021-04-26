
public class ConvertToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=10;
		String s=String.valueOf(i);
		String st=String.format("%d",i);
		System.out.println(s);
		System.out.println(st);
		
		long l=99999L;
		s=String.valueOf(l);
		st=String.format("%d",l);
		System.out.println(s);
		System.out.println(st);
		
		float f=22.34F;
		s=String.valueOf(f);
		st=String.format("%f", f);
		System.out.println(s);
		System.out.println(st);
		
		double d=22.34;
		s=String.valueOf(d);
		st=String.format("%f", d);
		
		
		System.out.println("++====Strings====++");
		String str=Integer.toString(i);
		System.out.println(str);
		
		str=Long.toString(l);
		System.out.println(str);
		
		str=Float.toString(f);
		System.out.println(str);
		
		str=Double.toString(d);
		System.out.println(str);
		
	}

}
