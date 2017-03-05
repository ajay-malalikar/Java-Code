package DoublyLinkedList;
import java.util.*;

public class PureStorage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] events;
		
	}
	public static int method(String[] events){
		HashMap<String, Integer> hash = new HashMap<>();

		Stack<String> stck = new Stack<>();


		for(int i=0;i<events.length;i++)
		{

			String[] input = events[i].split(" ");
	
	
			if(input[0].equals("ACQUIRE")) 
			{
	
				if(hash.containsKey(input[1]) && hash.get(input[1]) == 1) 
				{
		
					return i+1;
		
				} 
				else 
				{
		
					stck.push(input[1]);
			
					hash.put(input[1], 1);
		
				}
	
	
			} 
			else if(input[0].equals("RELEASE")) 
			{
	
				if(stck.isEmpty())
					return i+1;
	
	
				if(input[1].equals(stck.peek())) 
				{
		
					stck.pop();
			
					hash.put(input[1], 0);
	
				}
	
				else
					return i+1;
	
			}

		}

		if(!stck.isEmpty())
			return events.length;
		return 0;
	}

}
