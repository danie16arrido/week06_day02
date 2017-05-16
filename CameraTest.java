import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import org.junit.*;

public class CameraTest {
  Camera camera;

  @Before
  public void before(){
    camera = new Camera("Sony", "Compact", 10);
  }

  @Test
  public void hasMake(){
    assertEquals("Sony", camera.getMake());
  }

  @Test
  public void hasPrintDetails(){
    assertEquals("Soney details: \n\tBody Type: Compact \n\tMegaPixels: 10", camera.printDetails());
  }
}
