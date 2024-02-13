public class Inky{
	
	//Constructor
	public Inky(String str){  //constructor overloading, differentiate constructor by parameters
		System.out.println(str);
	}
	
	//Constructor
	public Inky(String str1, String str2, String str3){
		
		System.out.println(str2+" "+str1);
		System.out.println(str1+" "+ str3);
		System.out.println(str2+" "+str1+" "+str3);
	}
	

	//Main method
	public static void main(String[] args){
		String pinky = "donky";

		//create object of Inky
		Inky ponky = new Inky(pinky);
		
		String blinky = "pinky";
		String rinky  = "monky";
		Inky ponky2 = new Inky(pinky,blinky,rinky);

	}
}