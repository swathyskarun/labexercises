package lab9;

interface Findpower{
	public int pow(int x, int y);
}

public class Exercise1 {

	public static void main(String[] args) {
		
		Findpower p1 = (x,y)->{
			int p=1;
			for(int i =0;i<y;i++)
				p*=x;
			return p;
		};
		System.out.println(p1.pow(2,3));
	}
}
