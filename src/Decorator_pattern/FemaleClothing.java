package Decorator_pattern;

public class FemaleClothing implements Clothing{

    @Override
    public String getDescription() {
        return "Female Clothing";
    }

    @Override
    public double getTotalPrice() {
        return 0;
    }
}
