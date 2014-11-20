package zadacaPonovo;
import java.util.*;
public class FizzBuzzWhile {
public static void main(String[] args) {
	System.out.println("Unesite broj!");
	int num = TextIO.getlnInt();
	int fizz=0;
	int buzz=0;
	
	while (num >0) { 
		
		if  (num % 5 == 0){
			buzz ++; }
	if (num % 3 ==0) {
		fizz ++;}
	num--;
	}
   System.out.println("Djeljivih sa 3 ima " + fizz);
   System.out.println("Djeljivih sa 5 ima " + buzz);
}
}
