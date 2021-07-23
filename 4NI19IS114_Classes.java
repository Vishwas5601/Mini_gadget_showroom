package ProgramA;           //Package name-ProgramA
import java.io.IOException;
import java.util.*;

// super class
class gadget{
	
	
	public int p=0, q=0, r=0, t=0, u=0;
	public int a,b,d,e;
	protected int v[]=new int[100],w[]=new int[100];
	public Scanner sc;
	
	
	public void gadgets() throws IOException{
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("---------------------------------Welcome to Mini Electronic Showroom------------------------------------");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
		start();
	}
	
	public void start() throws IOException {
		sc = new Scanner(System.in);
		
		System.out.println("\n"
				+ "****************************");
		System.out.println("Please select your interest\n"
				+ "****************************\n"
				+ " [1]  Mobiles\n"
				+ " [2]  Laptops\n"
				+ " [3]  Smartwatches\n"
				+ " [4]  Earbuds\n"
				+ "****************************\n");
		a= sc.nextInt();
		if(a==1) {
			mobiles();
		}
		else if (a==2) {
			laptops();
		}
		else if (a==3) {
			watches();
		}
		else if(a==4) {
			Audio();
		}
			
		
		else
		{
			throw new IOException("Sorry Invalid Option :(");
		}
		return;
	}
	
	public void mobiles() {
		System.out.println("****************************"
				+ "\nEnter Id to view details\n"
				+ "****************************");
		System.out.println(" [Id]	Mobiles\n"
				+ "\n"
				+ "[101]  Samsung galaxy S21 Ultra\n"
				+ "[102]  iPhone 12 Pro\n"
				+ "[103]  OnePlus 9 Pro\n"
				+ "\n"
				+ "[0]  Back\n"
				+ "****************************\n");
		return;
	}
   public  void laptops() {
		
		System.out.println("****************************"
				+ "\nEnter Id to view details\n"
				+ "****************************");
		System.out.println(" [Id] 	Laptops\n"
				+ "\n"
				+ "[201]  HP 15(2021)\n"
				+ "[202]  Lenovo ThinkPad E460\n"
				+ "[203]  Dell Inspiron 3576\n"
				+ "\n"
				+ "[0]  Back\n"
				+ "****************************\n");
		return;
		
	}
	
	

public void watches(){
	System.out.println("****************************\n"
			+ "Enter Id to view details\n"
			+ "****************************");
	System.out.println(" [Id]  Smartwatches\n"
			+ "\n[301]  Samsung Galaxy Watch 4G\n"
			+ "[302]  Realme Watch S pro\n"
			+ "\n"
			+ "[0]  Back\n"
			+ "****************************\n");
	
	return;
}

public void watches(String a, String b){							//OVERLOADING
	System.out.println("****************************						(Method Overloading)\n"
			+ "Enter Id to view details\n"
			+ "****************************");
	System.out.println(" [Id]  Smartwatches\n"
			+ "\n[301]  "+a+""
			+ "[302]  "+b+""
			+ "\n"
			+ "[0]  Back\n"
			+ "****************************\n");
	
	return;
}
public void watches(String a, String b, String c){					//OVERLOADING
	System.out.println("****************************						(Method Overloading)\n"
			+ "Enter Id to view details\n"
			+ "****************************");
	System.out.println("\n [Id]  Smartwatches\n"
			+ "\n[301]  "+a+""
			+ "[302]  "+b+""
			+ "\n"
			+ ""+c+""
			+ "****************************\n");
	
	return;
}

public void Audio() {
	System.out.println("****************************						(Printing from parent class)\n"
			+ "Enter Id to view details\n"
			+ "****************************");
	System.out.println("\n Id. 	Earphones\n"
			+ "\n[401]  OnePlus Buds Z True Wireless Stereo (TWS) Earphones Share\r\n"
			+ "[402]  Boat Airdopes 311-V2 True Wireliss Stereo\n"
			+ "\n[0]  Back\n"
			+ "****************************\n");
return;
}

public void oneplus() {
	System.out.println("										(Printing from parent class)\n"
			+ "\n	 Details  \n"
			+ "*********************************************\n"
			+ "\tOnePlus 9 Pro\n"
			+ "*********************************************\n"
			+ "Display  :  6.70-inch, 1440x3216 pixels\r\n"
			+ "Processor:  Qualcomm Snapdragon 888\r\n"
			+ "RAM	    :  8GB\r\n"
			+ "Storage	:  128GB\r\n"
			+ "Battery Capacity :	4500mAh\r\n"
			+ "Rear Camera      :	48MP + 50MP + 8MP\r\n"
			+ "Front Camera     :	16MP\n"
			+ "Cost  :  Rs.64,999\n"
			+ "\n"
			+ "[0]  Back\n"
			+ "*********************************************\n");
	e= sc.nextInt();
	
	if (e==0) {
		mobiles();
	}
return;

}

}

// sub class
// this class contains details of devices
public class details extends gadget{			
	
	public void Audio() {
		System.out.println("****************************				 (Printing from child class)\n"
				+ "Enter Id to view details\n"
				+ "****************************");
		System.out.println("[Id] 	Earphones\n"
				+ "\n[401]  OnePlus Buds Z True Wireless Stereo (TWS) Earphones Share\r\n"
				+ "[402]  Boat Airdopes 311-V2 True Wireliss Stereo\n"
				+ "\n[0]  Back"
				+ "\n****************************\n");
	return;
	}
	
	public void samsung()  {
		System.out.println("\n	 Details  \n"
				+ "*********************************************\n"
				+ "\tSamsung Galaxy S21 Ultra\n"
				+ "*********************************************\n"
		        + "Display  :  6.80-inch, 1440x3220 pixels\r\n"
				+ "Processor:  Samsung Exynos 2100\r\n"
				+ "RAM      :  12GB\r\n"
				+ "Storage  :  128GB\r\n"
				+ "Battery Capacity  :  5000mAh\r\n"
				+ "Rear Camera   :  108MP + 12MP + 10MP + 10MP\r\n"
				+ "Front Camera  :  40MP\r\n"
				+ "Cost     :  Rs.1,05,999+gst \r\n"
				+ "\n"
				+ "[0]  Back\n"
				+ "*********************************************\n");
		int c= sc.nextInt();
		if (c==0) {
			mobiles();
		}
		else 
		return;
	}
		
	public void iphone()  {
		System.out.println("\n	 Details  \n"
				+ "*********************************************\n"
				+ "\tiPhone 12 Pro\n"
				+ "*********************************************\n"
				+ "Display  :  6.10-inch, 1170x2532 pixels\r\n"
				+ "Processor:  Apple A14 Bionic\r\n"
				+ "RAM  :  6GB\r\n"
				+ "Storage  :  64GB\r\n"
				+ "Rear Camera :  12MP + 12MP + 12MP\r\n"
				+ "Front Camera:  12MP\n"
				+ "Cost     :  1,15,100\n"
				+ "\n"
				+ "[0]  Back\n"
				+ "*********************************************\n");
		d= sc.nextInt();
		if (d==0) {
			super.mobiles();                          //SUPER keyword
		}
		else return;
	}
	public void oneplus() {
		System.out.println("									(Printing from child class)\n"					
																		//OVERRIDING
				+ "\n	 Details  \n"
				+ "*********************************************\n"
				+ "\tOnePlus 9 Pro\n"
				+ "*********************************************\n"
				+ "Display  :  6.70-inch, 1440x3216 pixels\r\n"
				+ "Processor:  Qualcomm Snapdragon 888\r\n"
				+ "RAM	    :  8GB\r\n"
				+ "Storage	:  128GB\r\n"
				+ "Battery Capacity :	4500mAh\r\n"
				+ "Rear Camera      :	48MP + 50MP + 8MP\r\n"
				+ "Front Camera     :	16MP\n"
				+ "Cost  :  Rs.64,999\n"
				+ "\n"
				+ "[0]  Back\n"
				+ "*********************************************\n");
		e= sc.nextInt();
		
		if (e==0) {
			super.mobiles();
		}
return;

	}
	public void hp() {
		System.out.println("\n	 Details  \n"
				+ "*********************************************\n"
				+ "\t HP 15 (2021)\n"
				+ "*********************************************\n"
				+ "Display size  :  15.60-inch\r\n"
				+ "Display resolution  :  1366x768 pixels\r\n"
				+ "Touchscreen   :  No\r\n"
				+ "Processor     :  Core i5\r\n"
				+ "RAM  :  16GB\r\n"
				+ "OS   :  Windows 10\r\n"
				+ "Hard disk : 512GB\r\n"
				+ "SSD  :  No\r\n"
				+ "Graphics  :  AMD Radeon R4\r\n"
				+ "Weight    :  1.86 kg\n"
				+ "Cost : Rs.66,600\n"
				+ "\n"
				+ "[0]  Back\n"
				+ "*********************************************\n");
		
		int g = sc.nextInt();
		if (g==0) {
			laptops();						
		}
		else return;
				
	}
	
	public void lenovo() {
		System.out.println("\n	 Details  \n"
				+ "*********************************************\n"
				+ "\tLenovo ThinkPad E460\n"
				+ "*********************************************\n"
		        +"Display size  :  14.00-inch\r\n"
		        + "Display resolution : 1366x768 pixels\r\n"
		        + "Processor    : Core i5\r\n"
		        + "RAM   :  4GB\r\n"
		        + "OS    :  DOS\r\n"
		        + "Hard disk  : 1TB\r\n"
		        + "SSD   : No\r\n"
		        + "Graphics   : AMD Radeon R7 M360\r\n"
		        + "Weight : 1.90 kg\n"
		        + "Cost   : Rs.46,800\n"
		        + "\n[0]  Back\n"
		        + "*********************************************\n");
		int h=sc.nextInt();
		if (h==0) {
			laptops();
		}
		else return;
	}
	
	
	public void dell( ) {
		System.out.println("\n	 Details  \n"
				+ "*********************************************\n"
				+ "\tDell Inspiron 3576\n"
				+ "*********************************************\n"
				+ "Display size  :  15.60-inch\r\n"
				+ "Display resolution : 1920x1080 pixels\r\n"
				+ "Touchscreen   :  No\r\n"
				+ "Processor     : Core i7\r\n"
				+ "RAM   :  8GB\r\n"
				+ "OS    : Windows 10\r\n"
				+ "Hard disk   : 2TB\r\n"
				+ "SSD   :  No\r\n"
				+ "Graphics    : Intel Integrated UHD Graphics 620\r\n"
				+ "Weight  : 2.13 kg\n"
				+ "Cost    :Rs. 49,600\n"
				+ "\n[0]  Back\n"
				+ "*********************************************\n");
		
		int i=sc.nextInt();
		if (i==0) {
			laptops ();
		}
		else return;

}
	public void SGwatch() {
		System.out.println("\n	 Details  \n"
				+ "*********************************************\n"
				+ "\tSamsung Galaxy Watch 4G\n"
				+ "*********************************************\n"
				+ "Touchscreen  :	Yes\r\n"
				+ "Water Resistant  :  5ATM\n"
				+ "Sensor	Accelerometer, Barometer, Gyroecope, Heart Rate Sensor, Ambient Light Sensor\r\n"
				+ "Battery Life  :	Upto 4 days\r\n"
				+ "Charger Type	 :  Wireless Charging\r\n"
				+ "Call Function  :  Yes\r\n"
				+ "Bluetooth Version	4.2\r\n"
				+ "RAM  :  1.5GB\r\n"
				+ "Display Resolution	: 360 x 360 pixels\r\n"
				+ "Display Size	: 46mm\r\n"
				+ "Display Type :  Super AMOLED\r\n"
				+ "Speaker :  Yes\r\n"
				+ "Microphone :  Yes\n"
				+ "Price  :  Rs.19,990\n"
				+ "\n[0]  Back\n"
				+ "*********************************************\n");
		int k=sc.nextInt();
		if (k==0) {
			watches();
		}
		else return;
	}
	
	public void realme() {
		System.out.println("\n	 Details  \n"
				+ "*********************************************\n"
				+ "\tRealme Watch S pro\n"
				+ "*********************************************\n"
				+ "Touchscreen  :  Yes\r\n"
				+ "Water Resistant  :  5ATM\r\n"
				+ "Battery Type	420mAh\r\n"									
				+ "Battery Life  :  	14 days\r\n"
				+ "Charge Time   :  2 hours\r\n"
				+ "Charger Type  :  Magnetic\r\n"
				+ "Call Function :  No\r\n"
				+ "Bluetooth  :  Yes\r\n"
				+ "Compatible Operating System  :  Android, iOS\r\n"
				+ "Processor Name  :  ARM Cortex M4\r\n"
				+ "Display Resolution  :  454x454\r\n"
				+ "Step Count  :  Yes\r\n"
				+ "Heart Rate Monitor  :  Yes\r\n"
				+ "\n[0]  Back\n"
				+ "*********************************************\n");
		int l=sc.nextInt();
		if (l==0) {
			watches("Samsung Galaxy Watch 4G\n", "Realme Watch S pro\n");  //OVERLOADING
			watches("Samsung Galaxy Watch 4G\n", "Realme Watch S pro\n","[0]  Back\n");  //OVERLOADING

		}
		else return;
	}
	
	public void oneplusbuds() {
		System.out.println("\n	 Details  \n"
				+ "******************************************************\n"
				+ "  OnePlus Buds Z True Wireless Stereo (TWS) Earphones\n"
				+ "******************************************************\n"
				+ "Headphone Type	In-Ear\r\n"
				+ "Microphone	Yes\r\n"
				+ "Driver Size (mm)	10\r\n"
				+ "Water Resistant	IP55\r\n"
				+ "Bluetooth Version	5\r\n"
				+ "Bluetooth range (Metres)	10\r\n"
				+ "Battery Capacity (mAh) Earpieces	40\r\n"
				+ "Battery Capacity (mAh) Case	450\n"
				+ "Price  :  Rs.2,999\n"
				+ "\n[0]  Back\n"
				+ "*********************************************\n");
		int n=sc.nextInt();
		if (n==0) {
			super.Audio();					//SUPER keyword
		}
		else return;

	}
	
	public void boat() {
		System.out.println("\n	 Details  \n"
				+ "***************************************************************\n"
				+ "   BoAt Airdopes 311-V2 True Wireless Stereo (TWS) Earphones\r\n"
				+ "***************************************************************\n"
				+ "\nColor  :	Red\r\n"
				+ "Headphone Type  :  In-Ear\r\n"
				+ "Driver Size (mm)  :	6\r\n"
				+ "Number of Drivers :  2\r\n"
				+ "Water Resistant	 :  IPX5\r\n"
				+ "Frequency Response Range  :	20Hz-20,000Hz\r\n"
				+ "Bluetooth  :  Yes\r\n"
				+ "Bluetooth Version    : 5\r\n"
				+ "Charging Time (Hrs)  : 1.5\r\n"
				+ "Battery Capacity (mAh) Earpieces : 43"
				+ "Price  : Rs.2,499.\n"
				+ "\n[0]  Back\n"
				+ "********************************************************\n");
		int o=sc.nextInt();
		if (o==0) {
			this.Audio();			//THIS keyword
		}
		else return;

	}
	
	public void end() {
		System.out.println("Wrong Entry\n");
		}
}

