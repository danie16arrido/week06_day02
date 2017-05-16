import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PhotographerTest {
  Photographer photographer;
  Camera camera1;
  Camera camera2;

  @Before
  public void before(){
    photographer = new Photographer("Daniel");
    camera1 = new Camera("Sony");
    camera2 = new Camera("Cannon");
  }

  @Test
  public void hasName(){
    assertEquals("Daniel", photographer.getName());
  }


  @Test
  public void canStoreCamera(){
    photographer.addCamera(camera1);
    assertEquals(1, photographer.camerasCount());
  }

  @Test
  public void canDeleteCameras(){
    photographer.addCamera(camera1);
    photographer.addCamera(camera2);
    assertEquals(2, photographer.camerasCount());

    photographer.deleteCamera(camera1);
    assertEquals(1, photographer.camerasCount());
  }
}
