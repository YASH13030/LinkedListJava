package DSA;
import java.util.LinkedList;
public class LLCollections {
	public static void main(String[] args) {
		
		//declaration syntax.
		LinkedList<String> list = new LinkedList<>();
		//adding elements.
		list.addFirst("y");
		list.addLast("a");
		list.addLast("s");
		list.addLast("h");
		list.addFirst("e");
		System.out.println(list);
		
		//size function.
		System.out.println(list.size());
		//loops over list.
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+"->");
		}
		//deleting elements.
		list.removeFirst();
		System.out.println("\n"+list);
		list.removeLast();
		System.out.println(list);
		//deleting with index.
		list.remove(1);
		System.out.println(list);
	}
}
