import java.util.ArrayList;
import java.util.HashMap;

public class Photographer {
  private String name;
  private ArrayList<Printable> myCameras;
  private HashMap<String, Integer> journal = new HashMap<>();



  public Photographer(String name) {
    this.name = name;
    this.myCameras = new ArrayList<Printable>();
  }

  public String getName(){
    return this.name;
  }

  public int camerasCount(){
    return myCameras.size();
  }

  public void addCamera(Printable camera){
    myCameras.add(camera);
  }

  public void deleteCamera(DigitalCamera camera){
    int idx = 0;
    while (idx < myCameras.size())
    {
       if(myCameras.get(idx) == camera)
       {
         myCameras.remove(idx);
      }
      else
      {
        ++idx;
      }
    }
  }

  public void addJournal(String date, int numberOfPhotos){
    journal.put(date, numberOfPhotos);
  }

  public int getNumberOfPhotos(String date){
    return journal.get(date);
  }
}
