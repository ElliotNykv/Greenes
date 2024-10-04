// Abstract klass som måste ärvas för att används.
public abstract class Plant implements LiquidAmount, LiquidType  {

  protected String plantName;
  protected double plantHeight;

  // Konstruktor för plant.
  public Plant(String plantName, double plantHeight) {
    this.plantName = plantName;
    this.plantHeight = plantHeight;
  }

  public String getPlantName() {
    return plantName;
  }


  // Metoder som används i subklasserna och deras metod kropp ser lite olika ut därför är det av typen abstract.
  public abstract String getLiquidType();

  public abstract double calcLiquidAmount();
}
