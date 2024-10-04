import javax.swing.*;

class MainProgram {

  // Konstruktor
  public MainProgram() {
    Plant[] plants = {
            new Cactus("Igge", 0.2),
            new Palm("Laura", 5),
            new Carnivorous("Meatloaf", 0.7),
            new Palm("Olof", 1)
    };


    boolean found = false;

    while (!found) {
      String plantName = JOptionPane.showInputDialog("Vilken växt ska få vätska?");


      if (plantName == null) {
        System.exit(0);
      }

      if (plantName.trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Värdet kan inte vara tomt. \nTesta igen!");
        continue;
      }

      for (Plant plant : plants) {
        if (plantName.equalsIgnoreCase(plant.getPlantName())) {
          found = true;
          double liquidAmount = plant.calcLiquidAmount();
          String liquidType = plant.getLiquidType();
          JOptionPane.showMessageDialog(null, "Plantan " + plant.getPlantName() + " behöver " + liquidAmount + "l av " + liquidType);
          break;
        }
      }

      if (!found) {
        JOptionPane.showMessageDialog(null, "Hittar ingen planta med namnet " + plantName + ". \nTesta med ett nytt namn!");
      }
    }

  }


  public static void main(String[] args) {
    // Skapar ett objekt av klassen MainProgram med hjälp av dess konstruktor, vilket sedan startar programmet.
    MainProgram start = new MainProgram();

  }
}