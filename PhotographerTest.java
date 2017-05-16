import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PhotographerTest {
  Photographer photographer;

  @Before
  public void before(){
    photographer = new Photographer("Daniel");
  }

  @Test
  public void hasName(){
    assertEquals("Daniel", photographer.getName());
  }
}
