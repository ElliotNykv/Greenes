public class Cactus extends Plant {

  // En Konstruktor som ärver plantName och plantHeight.
  public Cactus(String plantName, double plantHeight) {
    super(plantName, plantHeight);
  }

  // Polymorfism metoder som ärvs från superklassen plant
  @Override
  public String getLiquidType() {
    return "mineralvatten";
  }
  // Polymorfism metoder som ärvs från superklassen plant
  @Override
  public double calcLiquidAmount() {
    return 0.2;
  }
}
