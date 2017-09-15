
public class Called {

	public static void main(String[] args){
		working_methods objectone = new working_methods();
		my_methods twonotes = new my_methods();
		Constructor test = new Constructor(3, (float) 30.3, "Holy-marie");
		
		System.out.println(test.rooms);
		System.out.println(test.size);
		System.out.println(test.street);
		
		objectone.message();
		System.out.print(objectone.soma(4, 6) + twonotes.media(7.0, 10));

	}
}
