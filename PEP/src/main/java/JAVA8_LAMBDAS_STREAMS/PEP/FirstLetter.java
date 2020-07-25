package JAVA8_LAMBDAS_STREAMS.PEP;
import java.util.*;
import java.util.stream.Collectors;
public class FirstLetter {
	List<String> Lambda_streams(List<String> strings) {
		return strings.stream().filter(str->(str.startsWith("a") && str.length()==3)).collect(Collectors.toList());
		
	}

}
