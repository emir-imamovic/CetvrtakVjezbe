package zadacaPonovo;
import java.util.*;
public class FizzBuzz {
public static void main(String[] args) {
	System.out.println("Unesite broj.");
	int num;
	int brojac3=0;
	int brojac5=0;
	int i=0;
	num = TextIO.getlnInt();
	for ( i=1; i<=num; i++)
			{
		
		if (i % 3 == 0) {
			brojac3 ++;
		}
		if (i % 5 == 0) {
			brojac5 ++;
		}
			}
	System.out.println("Djeljivih sa 3 ima: " + brojac3);
	System.out.println("Djeljivih sa 5 ima: " + brojac5);

}
}
