public class Carnivorous extends Plant {

  // Konstruktor för carnivorous
  public Carnivorous(String plantName, double plantHeight) {
    super(plantName, plantHeight);
  }

  // Polymorfism metoder som ärvs från superklassen plant
  @Override
  public String getLiquidType() {
    return "proteindryck";
  }
  @Override
  public double calcLiquidAmount() {
    return 0.1 + (0.2 * plantHeight) ;
  }
}
