public class Camera implements Printable{
  private String make;

  public Camera(String make){
    this.make = make;
  }

  public String getMake(){
    return this.make;
  }

  public String printDetails(){
    return String.format("%s details", this.make);
  }
}
