public class Palm extends Plant {

  public Palm(String plantName, double plantHeight) {
    super(plantName, plantHeight);
  }

  @Override
  public double calcLiquidAmount() {
    return 0.5 * plantHeight;
  }

  @Override
  public String getLiquidType() {
    return "vatten";
  }
}
