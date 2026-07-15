
/*ID: 2547394
 * Isaac Mathews Panackamattom*/


public class IsaacCode {
	public static void main(String[] args) {
		System.out.println("\t\tMultiplication Table");
		System.out.print("\t");
	for(int i = 1; i<10;i++){
		//boolean ans = i%2 == 1 ? i : "\t";
		if (i%2 == 1) {
			System.out.print(i);
		}
		else {
			System.out.print("\t");
		}
	}
	
	int a = 0;
	System.out.print("\n");
	while( a < 50) {
	System.out.print("-");
	a++;
	}
	
	int i = 1;
	System.out.print("\n");
	for(int j = 1; j<10;j++) {
		if(j%2 == 0) {
			System.out.print(j+"|\t");
			while(i < 10) {
				if (i%2 == 1) {
					System.out.print(i*j+"\t");
					i++;
				}
				else if (i%2 == 0) {
					i++;
				}
			}
			System.out.print("\n");
		}
	}
	
	}
}