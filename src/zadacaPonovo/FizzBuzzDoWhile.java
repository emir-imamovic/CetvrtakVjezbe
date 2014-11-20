package zadacaPonovo;
import java.util.*;
public class FizzBuzzDoWhile {
public static void main(String[] args) {
	System.out.println("Unesite broj!");
	int broj = TextIO.getlnInt();
	int fizz =0;
	int buzz = 0;
	do {
		if (broj % 3 == 0){
			fizz++;
		}
		if (broj % 5 == 0) {
			buzz ++;
		}
		broj --;
	}
	while (broj > 0) ;
	{
		System.out.println("Djeljivih sa 3 ima " + fizz);
		System.out.println("Djeljivih sa 5 ima " + buzz);
	}
}
}
