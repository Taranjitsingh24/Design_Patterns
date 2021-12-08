package Decorator_pattern;

public class MaleClothing implements Clothing {


    @Override
    public String getDescription() {
        return "Male Clothing";
    }

    @Override
    public double getTotalPrice() {
        return 0;
    }
}
