package Decorator_pattern;

public abstract class ClothingDecorator implements Clothing{

protected Clothing decoratedStyle;
public  ClothingDecorator (Clothing decoratedStyle){
    this.decoratedStyle = decoratedStyle;


}


}
