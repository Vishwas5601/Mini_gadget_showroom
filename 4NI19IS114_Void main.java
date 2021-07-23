package ProgramB;
import java.io.IOException;
import java.util.Scanner;
import ProgramA.*;

public class project_b {

	public static void main(String[] args) {
		
		try {
			
			
		details ca = new details();
		ca.gadgets();
		Scanner si = new Scanner(System.in);
	while(true) {
			int b= si.nextInt();
		do {
	    
	      if (b==101) {
	    	ca.samsung();
	    }
	      else if (b==102) {
	    	ca.iphone();
	    }
	      else if (b==103) {
	    	ca.oneplus();				//overriding
	      }
	      else if (b==201) {
				ca.hp();
			}
			else if(b==202) {
				ca.lenovo();
			}
			else if(b==203) {
				ca.dell();
			}
			else if (b==301) {
				ca.SGwatch();
			}
			else if (b==302) {
				ca.realme();
			}
			else if (b==401) {
				ca.oneplusbuds();
			}
			else if (b==402) {
				ca.boat();
			}
			else if(b==0)
			{
				ca.start();
			}
			
			else {
				
					ca.end();
			break;
						}
	}while (b!=101 && b!= 102&&b!= 103&&b!= 201&&b!= 202&&b!=203&&b!= 301&&b!= 302&&b!= 401&&b!= 402&&b!=0);
	}
	}
		catch (IOException e)
		{
			System.out.println("Checked Exception --> IOException occured: " + e);
		}
		
		int show = 10;
		
		System.out.println("\n\nAs you didn't select from the given option, your option is show/0 gives Unchecked Exception --> ");
		System.out.println((show/0));
	}
	

	
}