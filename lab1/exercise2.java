package lab1;
import java.util.Scanner;
public class exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String light = sc.nextLine();
		switch(light)
		{
		case "red": System.out.println("STOP");
		            break;
		case "yellow": System.out.println("READY");
                  break;
		case "green": System.out.println("GO");
                  break;
        default: break;
		}
	

	}

}
