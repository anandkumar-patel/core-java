package anand.java8.stream;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 
 * @author anandpatel
 *
 */
public class IntStreamExp {

	public static void main(String[] args) {

		System.out.println("**************** intStream creation ways ********************");
		IntStream.range(1, 5).forEach(i->System.out.print(i + " "));
		System.out.println();
		IntStream.rangeClosed(1, 5).forEach(i->System.out.print(i + " "));
		System.out.println();
		IntStream.of(1,2,3,4,5).forEach(i->System.out.print(i + " "));
		System.out.println();
		//IntStream.generate(null)
		
		IntStream.builder();
		IntStream.iterate(0, null);
		IntStream.iterate(0, null, null);
		

		System.out.println("**************** common functions ********************");
		int[] inputArray = {3,2,5,2,1,6,5,9,8};
		int reduce = IntStream.of(inputArray).filter(i-> i>1).skip(2).map(i->i*2).distinct().reduce(1, (a, b)->a*b);
		System.out.println("reduce is :" + reduce);
		//converting to Stream of Integer.
		Stream<Integer> stream = IntStream.of(inputArray).boxed();
		List<Integer> list = stream.collect(Collectors.toList());
		System.out.println(list);
		
		boolean anyMatch = IntStream.of(inputArray).anyMatch(i-> i%2==1);
		System.out.println("any match : "+anyMatch);
		boolean allMatch = IntStream.of(inputArray).allMatch(i->i%2==1);
		System.out.println("all match : "+allMatch);

		
		System.out.println("**************** mathematical functions ********************");
		int min = IntStream.of(inputArray).min().getAsInt();
		int max = IntStream.of(inputArray).max().getAsInt();
		double avg = IntStream.of(inputArray).average().getAsDouble();
		int sum = IntStream.of(inputArray).sum();
		long count = IntStream.of(inputArray).count();
		System.out.println("min is :" + min);
		System.out.println("max is :" + max);
		System.out.println("avg is :" + avg);
		System.out.println("sum is :" + sum);
		System.out.println("count is :" + count);

		System.out.println("**************** statistics function ********************");
		IntSummaryStatistics statistics = IntStream.of(inputArray).summaryStatistics();
		System.out.println("min is :" + statistics.getMin());
		System.out.println("max is :" + statistics.getMax());
		System.out.println("avg is :" + statistics.getAverage());
		System.out.println("sum is :" + statistics.getSum());
		System.out.println("count is :" + statistics.getCount());

	}
}
