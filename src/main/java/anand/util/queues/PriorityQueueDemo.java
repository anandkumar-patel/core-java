package anand.util.queues;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {

		PriorityQueue<Integer> queue= new PriorityQueue<>();
		queue.add(55);
		queue.add(21);
		queue.add(11);
		queue.add(34);
		queue.add(43);
		
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		
		//PriorityQueue<String> strqueue= new PriorityQueue<>();
		//PriorityQueue<String> strqueue= new PriorityQueue<>(Collections.reverseOrder());
		//PriorityQueue<String> strqueue= new PriorityQueue<>(Comparator.reverseOrder());
		PriorityQueue<String> strqueue= new PriorityQueue<>(Comparator.comparingInt(String::length));
		strqueue.add("anandm");
		strqueue.add("patel");
		strqueue.add("Abhi");
		strqueue.add("Bimalesh");
		strqueue.add("hritesh");
		
		System.out.println(strqueue);
		System.out.println(strqueue.peek());
		
		
		System.out.println("poping each element : ");
		while(!strqueue.isEmpty()) {
			System.out.print(strqueue.poll()+ ", ");
		}
		


		//PriorityQueue<Task> taskQueue = new PriorityQueue<>(Comparator.comparingInt(t -> t.priority));
		PriorityQueue<Task> taskQueue = new PriorityQueue<>(Comparator.comparingInt(Task::getPriority));
		taskQueue.add(new Task("Task A", 3));
		taskQueue.add(new Task("Task B", 1));
		taskQueue.add(new Task("Task C", 2));
		taskQueue.add(new Task("Task D", 1));

		System.out.println(taskQueue.poll().name);
	}

}


class Task {
    String name;
    int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }
   
    public int getPriority() {
    	return this.priority;
    }
}
