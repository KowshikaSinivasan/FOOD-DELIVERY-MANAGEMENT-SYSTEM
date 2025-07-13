
import java.util.Random;

public class IdGenerator{
	
	public static String generateCustomerId() {
        Random random = new Random();
        StringBuilder customerId = new StringBuilder("C");

        for (int i = 0; i < 8; i++) {
            int digit = random.nextInt(10); // Generates a random digit between 0 and 9
            customerId.append(digit);
        }

        return customerId.toString();
    }
	public static String generateAddressId() {
        Random random = new Random();
        StringBuilder customerId = new StringBuilder("CA");

        for (int i = 0; i < 8; i++) {
            int digit = random.nextInt(10); // Generates a random digit between 0 and 9
            customerId.append(digit);
        }

        return customerId.toString();
	}
	 
	public static String generateRestaurantId() {
        Random random = new Random();
        StringBuilder restaurantId= new StringBuilder("R");

        for (int i = 0; i < 8; i++) {
            int digit = random.nextInt(10); // Generates a random digit between 0 and 9
            restaurantId.append(digit);
        }

        return restaurantId.toString();
    }
	public static String generateDriverId() {
        Random random = new Random();
        StringBuilder dId= new StringBuilder("D");

        for (int i = 0; i < 8; i++) {
            int digit = random.nextInt(10); // Generates a random digit between 0 and 9
            dId.append(digit);
        }

        return dId.toString();
    }
	public static String generateMembershipId() {
        Random random = new Random();
        StringBuilder dId= new StringBuilder("M");

        for (int i = 0; i < 8; i++) {
            int digit = random.nextInt(10); // Generates a random digit between 0 and 9
            dId.append(digit);
        }

        return dId.toString();
    }
	
	public static String generateOrderId() {
        Random random = new Random();
        StringBuilder dId= new StringBuilder("O");

        for (int i = 0; i < 15; i++) {
            int digit = random.nextInt(10); // Generates a random digit between 0 and 9
            dId.append(digit);
        }

        return dId.toString();
    }
	
	
	public static String generateDriverAddressId() {
        Random random = new Random();
        StringBuilder dId= new StringBuilder("DA");

        for (int i = 0; i < 8; i++) {
            int digit = random.nextInt(10); // Generates a random digit between 0 and 9
            dId.append(digit);
        }

        return dId.toString();
    }
}


