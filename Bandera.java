public class Bandera{
	public static void main (String args[]){
		char bandera[][]=new char[1][1];
		bandera[0][0]='-';


		for(int i=1;i<341;i++){
			if(i%34==0){
				System.out.println();
			}
			else if(i<=102){
				System.out.print("\033[0;31m" + "\033[41m" + bandera[0][0] + "\033[0m");
				}
			else if(i>102 && i<=238){
				System.out.print("\033[0;33m" + "\033[43m" + bandera[0][0] + "\033[0m");
			}
			else if(i>238){
				System.out.print("\033[0;31m" + "\033[41m" + bandera[0][0] + "\033[0m");
				}
		}
	}
}