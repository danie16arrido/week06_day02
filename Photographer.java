import java.util.ArrayList;

public class Photographer {
  private String name;
  private ArrayList<Printable> myCameras;


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
}
