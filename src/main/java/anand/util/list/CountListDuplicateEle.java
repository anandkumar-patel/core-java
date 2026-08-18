package anand.util.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountListDuplicateEle {
	
	public static void main(String[] args) {
		List<String> inputList = new ArrayList<>();
		inputList.add("expect1");
		inputList.add("expect2");
		inputList.add("expect2");
		inputList.add("expect3");
		inputList.add("expect3");
		inputList.add("expect3");
		inputList.add("expect4");
		inputList.add("expect4");
		inputList.add("expect4");
		inputList.add("expect4");
		
		CountListDuplicateEle obj = new CountListDuplicateEle();
		Map<String,Long> countData = obj.countByClassicalLoop(inputList);
		for(String key : countData.keySet()) {
			System.out.println(key +" present in list "+countData.get(key)+" times");
		}
		
		
		List<Integer> intData = new ArrayList<>();
		intData.add(11);
		intData.add(11);
		intData.add(12);
		intData.add(13);
		
		Map<Integer,Long> countData1 = obj.countByClassicalLoop(intData);
		for(Integer key : countData1.keySet()) {
			System.out.println(key +" present in list "+countData1.get(key)+" times");
		}
		
	}

	public<T> Map<T,Long> countByClassicalLoop(List<T> input) {
		Map<T,Long> output = new HashMap<>();
		for(T data : input) {
			if(output.containsKey(data)) {
				output.put(data, output.get(data)+1L);
			} else {
				output.put(data, 1L);
			}
		}
		return output;
	}
	
	public <T> Map<T, Long> countByClassicalLoopWithMapCompute(List<T> inputList) {
		Map<T, Long> resultMap = new HashMap<>();
		for (T element : inputList) {
			resultMap.compute(element, (k, v) -> v == null ? 1 : v + 1);
		}
		return resultMap;
	}
	
	public <T> Map<T, Long> countByStreamToMap(List<T> inputList) {
	    return inputList.stream().collect(Collectors.toMap(Function.identity(), v -> 1L, Long::sum));
	}

	public <T> Map<T, Long> countByStreamGroupBy(List<T> inputList) {
	    return inputList.stream().collect(Collectors.groupingBy(k -> k, Collectors.counting()));
	}
}
