package synchronization;
interface Animal{
	void sound();
}
//PROGRAM TO CREATE ANANYMOUS INNER CLASS FOR INTERFACE & IMPLEMENT ITS METHODS
public class Ananymous_Class{
	public static void main(String[] args) {
		Animal c = new Animal() {

			@Override
			public void sound() {
				System.out.println("Cat Cat");				
			}
			
		};
		c.sound();
		
		Animal d = new Animal() {

			@Override
			public void sound() {
				System.out.println("Dog Dog");				
			}
			
		};
		d.sound();

	}
}