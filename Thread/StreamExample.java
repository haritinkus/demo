
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class StreamExample {

	public static void main(String args[])
	{

		// Create a stream of integers
		List<String> list = Arrays.asList("Good",
										"A computer portal",
										"for",
										"Ghost");

		// Print the List
		System.out.println("List: " + list);

		// Create the predicate for item starting with G
		Predicate<String> predicate = new Predicate<String>() {
			@Override
			public boolean test(String s)
			{
				// filter items that start with "G"
				return s.startsWith("G");
			}
		};

		System.out.println("Stream from List with items"+
									" starting with G: ");

		// Convert List to stream
		list.stream()
			.filter(predicate)
			.forEach(System.out::println);
	}
}
