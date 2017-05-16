import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PhotographerTest {
  Photographer photographer;
  DigitalCamera camera1;
  AnalogCamera camera2;

  @Before
  public void before(){
    photographer = new Photographer("Daniel");
    camera1 = new DigitalCamera("Sony", "Compact", 10);
    camera2 = new AnalogCamera("Cannon", "Mid Size SLR", 15);
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

  @Test
  public void canAddJournalEntries(){
    photographer.addJournal("01012017", 5);
    assertEquals(5, photographer.getNumberOfPhotos("01012017"));
  }
}
