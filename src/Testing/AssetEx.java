package Testing;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssetEx {
	public String getValue(final String key)
	  {
		  Map<String,String> m = new HashMap<String, String>();
			  m.put("key 1", "value 11");
			  m.put("key 2", "value 11");
			  m.put("key 3", "value 3");
			  return m.get(key);
			  
			  
		}
		  @Test
		  public void test1()
		  {
			 AssetEx e=new AssetEx();
			 assertNotNull(e.getValue("key 1"));
			 
		  }
		 @Test
		  public void test2()
		 {
			  AssetEx e = new AssetEx();
			 assertNull(e.getValue("key 2"));
			 
		  }
		 @Test
		 public void test3()
		 {
			 AssetEx e= new AssetEx();
			 assertSame(e.getValue("key 1"), e.getValue("key 2"));
		 }
		 @Test
		 public void test4() {
			 AssetEx e = new AssetEx();
			 assertNotSame(e.getValue("key 2"), e.getValue("key 3"));
		}


}
