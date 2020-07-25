package JAVA8_LAMBDAS_STREAMS.PEP;
import java.util.*;
import java.util.function.Predicate;
public class PalindromeStrings {
	
	List<String>  palindromes(List<String> strings) {
		return filterList(strings,(String i)->{StringBuffer sb=new StringBuffer(); sb.append(i); return i.equals(sb.reverse().toString());});
		
	}
	
	//Predicate functional Interface
	public static List<String> filterList(List<String> list, Predicate<String> isPalindrome)
   {
	List<String> finalList=new ArrayList<>();
	for(String str:list) {
		if(isPalindrome.test(str))
		finalList.add(str);
		}
	return finalList;
  }
}
   
