
/**
 * Write a description of class Ingredient here.
 *
 * @author Joakim Christensen
 * @version (a version number or a date)
 */
public class Ingredient
{
    // Instance Variables
    private String name;
    private double kilocaloriesPer100g;
    private double carbohydratesPer100g;
    private double proteinPer100g;
    private double fatPer100g; 
    // Man kan sætte et , og skrive et andet variabel 
    // men jeg ved ikke hvad det gør
    // F.eks.
    // private double fatPer100g, fat; - dette virker på en eller anden måde
    
    // Constructors
    public Ingredient(String name, double fatPer100g) {
        this.name = name;
        this.fatPer100g = fatPer100g;
    }
    
    // Accessor Functions
    public String getName() {
        return name;
    }
    
    public double getKCAL() {
        return kilocaloriesPer100g;
    }
    
    public double getCarb() {
        return carbohydratesPer100g;
    }
    
    public double getProtein() {
        return proteinPer100g;
    }
    
    public double getFat() {
        return fatPer100g;
    }
    
    // Mutator Functions 
    public void setName(String name) {
        this.name = name;
    }
    
    public void setKCAL() {
        kilocaloriesPer100g = ((getCarb()*4)+(getProtein()*9)+(getFat()*4));
    }
    
    public void setCarb(double carb) {
        carbohydratesPer100g = carb;
    }
    
    public void setProtein(double protein) {
        proteinPer100g = protein;
    }
    
    public void setFat(double fat) {
        fatPer100g = fat;
    }
}
