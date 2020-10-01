public class Suiza{
	public static void main (String Args[]){
		char bandera[][] = new char[11][11];

		for(int i=0;i<1;i++){
			for(int j=0; j<bandera[0].length;j++){
				bandera[i][j]='R';
			}
		}
		for(int i=1;i<4;i++){
			for(int j=0; j<4;j++){
				bandera[i][j]='R';
			}
		}
		for(int i=1;i<4;i++){
			for(int j=4; j<7;j++){
				bandera[i][j]='B';
			}
		}
		for(int i=1;i<4;i++){
			for(int j=7; j<bandera[0].length;j++){
				bandera[i][j]='R';
			}
			}
		for(int i=4;i<7;i++){
			for(int j=0; j<2;j++){
				bandera[i][j]='R';
			}
		}
		for(int i=4;i<7;i++){
			for(int j=2; j<9;j++){
				bandera[i][j]='B';
			}
			}
			for(int i=4;i<7;i++){
			for(int j=9; j<bandera[0].length;j++){
				bandera[i][j]='R';
			}
			}
			for(int i=7;i<10;i++){
			for(int j=0; j<4;j++){
				bandera[i][j]='R';
			}
		}
		for(int i=7;i<10;i++){
			for(int j=4; j<7;j++){
				bandera[i][j]='B';
			}
		}
		for(int i=7;i<10;i++){
			for(int j=7; j<bandera[0].length;j++){
				bandera[i][j]='R';
			}
			}
			for(int i=10;i<bandera.length;i++){
			for(int j=0; j<bandera[0].length;j++){
				bandera[i][j]='R';
			}
		}
		for(int i=0; i<bandera.length; i++){
			for(int j=0;j<bandera[0].length; j++){
			if(bandera[i][j]=='R'){
				System.out.print("\033[0;31m" + "*");
			}
			if(bandera[i][j]=='B'){
				System.out.print("\033[0;37m" + "*");
			}
		}
		System.out.println();
		}
		
	}
}