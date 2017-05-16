public class AnalogCamera implements Printable{
  private String make;
  private String bodyType;
  private int efectivePixelsMega;

  public AnalogCamera(String make, String bodyType, int efectivePixelsMega){
    this.make = make;
    this.bodyType = bodyType;
    this.efectivePixelsMega = efectivePixelsMega;
  }

  public String getMake(){
    return this.make;
  }

  public String printDetails(){
    return String.format("%s details: \n\tBody Type: %s \n\tMegaPixels: %d", this.make, this.bodyType, this.efectivePixelsMega);
  }
}
