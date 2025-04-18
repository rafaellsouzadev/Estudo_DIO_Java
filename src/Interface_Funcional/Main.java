package Interface_Funcional;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		
		List<User> users = List.of(new User("Maria", 21), new User("João", 32), new User("Eduardo", 40),
				new User("Ana", 19));
		
		System.out.println("=========CONSUMER==============");
		//Consummer
		var comsumer = new Consumer<User>() {

			@Override
			public void accept(User t) {
				System.out.println(users);
				
			}
		};
		
		users.forEach(comsumer);
		
		System.out.println("\n=========LAMBDA================");
			
		
		// expresão lambda simplificada
		users.forEach(user -> System.out.println(user));
		
		System.out.println("\n=========METHOD REFERENCE==========");
		
		//method reference
		users.forEach(System.out::println);
		
		System.out.println("\n==========================");
		
		
		printStringValue(User::name, users);
		
		System.out.println("\n==========================");
		printStringValue(user -> String.valueOf(user.age()), users);
		
		System.out.println("\n==========================");
		printStringValue(Record::toString, users);
		
		

	}
	
	private static void printStringValue(Function<User, String> callback, List<User> users ) {
		users.forEach(u -> System.out.println(callback.apply(u)));
	}

}
