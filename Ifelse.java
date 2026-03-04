import java.util.Scanner;
public class Ifelse{
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("ENTER YOUR AGE: ");
	int a = scan.nextInt();
	if(a<18){
    System.out.println("MINOR");}
	else if(a>=18 && a<60){
	System.out.println("MAJOR");}
	else if(a>=60){
	System.out.println("SENOR CITIZEN");}
	
}
}