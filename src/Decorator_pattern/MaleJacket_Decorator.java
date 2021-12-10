package Decorator_pattern;

public class MaleJacket_Decorator extends ClothingDecorator{
    public MaleJacket_Decorator(Clothing decoratedStyle) {
        super(decoratedStyle);
    }

    public String getDescription() {
        return decoratedStyle.getDescription() + " \nMale Jacket" ;
    }

    // no change in the functionality
    @Override
    public double getTotalPrice() {
        return decoratedStyle.getTotalPrice() + 300;
    }
}
