package Decorator_pattern;

public class FemaleCardigans_Decorator extends ClothingDecorator{


    public FemaleCardigans_Decorator(Clothing decoratedStyle) {
        super(decoratedStyle);
    }

    public String getDescription() {
        return decoratedStyle.getDescription() + " \n Female Cardigan" ;
    }

    // no change in the functionality
    @Override
    public double getTotalPrice() {
        return decoratedStyle.getTotalPrice() + 300;
    }
}
