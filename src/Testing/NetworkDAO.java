package Testing;
import static org.mockito.Mockito.RETURNS_DEEP_STUBS;

public class NetworkDAO {
	public Object save(String filename) {
		System.out.println("Saved in Network location");
		return this;
	}

}