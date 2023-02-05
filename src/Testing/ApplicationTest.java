package Testing;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class ApplicationTest {
    @InjectMocks
    MainClass mainClass;
    @Mock
    DatabaseDAO dependentClassOne;
    @Mock
    NetworkDAO dependentClassTwo;
    @Before
    public void init() {
    	MockitoAnnotations.openMocks(this);
    }
	@Test
	public void validateTest() {
		when(dependentClassOne.save("sdfffg")).thenReturn(true);
		when(dependentClassTwo.save("sdfffg")).thenReturn(true);
		   boolean saved = mainClass.save("E:/file/test1.txt");
		   assertEquals(true, saved);
		
	}

}