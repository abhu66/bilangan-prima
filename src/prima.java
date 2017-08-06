
public class prima{
	public static void main(String [] BilanganPrima){
		int x = 100;
		System.out.println("Hasil nya : ");
		for(int a=2; a<x; a++){
			boolean Prima = true;
			for(int b=2; b<a; b++){
				if(a%b == 0){
					Prima = false;
					break;
				}
			}
			if(Prima == true){
		
				System.out.print(a +",");
			}
			
		}
	}
}
			
