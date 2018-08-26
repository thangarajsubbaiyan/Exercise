package oops;

public class StringExample {

	public static void main(String[] args) {
		
		String splitExample = "hai How are you";
		
		System.out.println("lenght=="+splitExample.split("//s").length);
		
		String[] str= new String[]{};
		
		
		
		String s1="Hai";
		
		String s2=new String("Hai");
		
		String s3="hai";		
		System.out.println("isSameObject=="+isSameObject(s1,s3));  ;
		
	
	}
	
	
	public static boolean isSameObject(String string1,String string2){
		
		
		
		if(string1 == string2){
			return true;
		}
		else{
			return false;
		}
	}

}
