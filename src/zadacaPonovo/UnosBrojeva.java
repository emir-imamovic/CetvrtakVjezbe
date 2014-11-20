package zadacaPonovo;
import java.util.*;
public class UnosBrojeva {
public static void main(String[] args) {
	System.out.println("Unesite brojeve!");
	int sum = 0;
	int brojac = 0;
	int num = -1;
	do { 
		num = TextIO.getlnInt();
		if (num != 0) {
	brojac ++;
	sum += num;
	  }
	}
	while (num ==-1);
	{
		System.out.println((double) sum / brojac);
	}
	}
}

