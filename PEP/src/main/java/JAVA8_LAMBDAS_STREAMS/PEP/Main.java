package JAVA8_LAMBDAS_STREAMS.PEP;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter List of Strings seperated by space");
		
		List<String> strings=Arrays.asList(sc.nextLine().split(" "));
		
		System.out.println("Enter List of Integers seperated by space");
		
		List<Integer> nums=Arrays.stream(sc.nextLine().split(" ")).mapToInt(x -> Integer.parseInt(x))
			    .boxed().collect(Collectors.toList());
		
		Averages avg=new Averages();
		
		FirstLetter f=new FirstLetter();
		
		PalindromeStrings pal=new PalindromeStrings();
		
		System.out.println("Average of numbers is: "+avg.calcavg(nums));
		
		System.out.println("Words of length 3 that start with letter 'a' are: "+f.Lambda_streams(strings));
		
		System.out.println("Palindromes in the given list are: "+pal.palindromes(strings));
		sc.close();
		
	}

}
