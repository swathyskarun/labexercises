package lab9;

interface StringAlter{
	public String alter(String s);
}

public class Exercise2 {

	public static void main(String[] args) {
		StringBuffer snew = new StringBuffer();
		StringAlter s1 = s->{
			//String[] snew = s.split("\\s+");
			//return s.split(" ");
			for(int i=0;i<s.length();i++)
			{
				snew.append(s.charAt(i));
				snew.append(" ");
			}
			
			return (snew.toString());
		};
		System.out.println(s1.alter("CAPGEMINI"));
	}

}
