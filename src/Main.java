import java.util.Scanner;
public class Main {
	static void printSquare(){
		for(int i=1; i<=5; i++){
			for(int j=1; j<=5; j++){
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	static void printRFPyramid(){
		for(int i=0; i<=5; i++){
			for(int j=0; j<=i; j++){
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	static void printLHPyramid(){
		for(int i=0; i<=5; i++){
			for(int j=5; j>=i; j--){
				System.out.print("  ");
			}
			for(int k=0; k<=i; k++){
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	static void printRhombus(){
		for(int i=0; i<5; i++){
			for(int j=0; j<i; j++){
				System.out.print(" ");
			}
			for(int k=0; k<4; k++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	static void printKPattern(){
		for(int i=5; i>=1; i--){
			for(int j=0; j<i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=2; i<=5; i++){
			for(int j=0; j<i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("\n1.Print Square");
			System.out.println("2.Print Right Half Pyramid");	System.out.println("3.Print Left Half Pyramid");
			System.out.println("4.Print Rhombus Pattern");
			System.out.println("5.Print K-Pattern");
			System.out.println("6.Exit\n");
			System.out.print("Enter Your Choice: ");
			int choice = scanner.nextInt();
			if(choice == 1){
				printSquare();
			}
			else if(choice == 2){
				printRFPyramid();
			}
			else if(choice == 3){
				printLHPyramid();
			}
			else if(choice == 4){
				printRhombus();
			}
			else if(choice == 5){
				printKPattern();
			}
			else if(choice == 6){
				System.out.println("Exititg..");
				break;
			}
			else{
				System.out.println("Invalid Input");
			}
		}
		scanner.close();
    }
}