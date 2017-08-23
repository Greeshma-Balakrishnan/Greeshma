
public class EqualityCheckTest {
	public static void main(String args[]) {

		
		Customer c1 = new Customer(1, "Vinod", "Bangalore", null,
				"vinod@mailinator.com");
		Customer c2 = new Customer(1, "Vinod", "Bangalore", null, null);

		// assertFalse(c1.equals(c2));
		// assertTrue(c1.equals(c2));

		// System.out.println(c1.getEmail());

		System.out.println(c1.equals(c2));
		c2.setEmail("vinod@mailinator.com");
		System.out.println(c1.equals(c2));


	}

}
