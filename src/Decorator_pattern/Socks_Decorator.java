package Decorator_pattern;

public class Socks_Decorator extends ClothingDecorator{
    public Socks_Decorator(Clothing decoratedStyle) {
        super(decoratedStyle);
    }

    public String getDescription() {
        return decoratedStyle.getDescription() + " \nSocks: €50" ;
    }

    // no change in the functionality
    @Override
    public double getTotalPrice() {
        return decoratedStyle.getTotalPrice() + 50;
    }
}
