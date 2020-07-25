package JAVA8_LAMBDAS_STREAMS.PEP;
import java.util.*;
public class Averages {
	double calcavg(List<Integer> list){
	return list.stream()
    .mapToInt((x) -> x)
    .summaryStatistics().getAverage();
	}
	}
