public class Camera implements Printable{
  private String make;
  private String bodyType;
  private int efectivePixelsMega;

  public Camera(String make, String bodyType, int efectivePixelsMega){
    this.make = make;
    this.bodyType = bodyType;
    this.efectivePixelsMega = efectivePixelsMega;
  }

  public String getMake(){
    return this.make;
  }

  public String printDetails(){
    return String.format("%s details", this.make);
  }
}
