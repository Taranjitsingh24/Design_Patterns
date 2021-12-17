package Factory_pattern;

public class WindowLaptop extends Laptop{

    public WindowLaptop(laptopType type) {
        super(type);
    }

    @Override
    protected void construct() {
        System.out.println(" Making a Window Laptop");

    }
}
