import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import org.junit.*;

public class CameraTest {
  Camera camera;

  @Before
  public void before(){
    camera = new Camera("Sony");
  }

  @Test
  public void hasMake(){
    assertEquals("Sony", camera.getMake());
  }

  @Test
  public void hasPrintDetails(){
    assertEquals("Sony details", camera.printDetails());
  }
}
