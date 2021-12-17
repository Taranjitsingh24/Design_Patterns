package Factory_pattern;
public class WindowType extends Laptop {

    public WindowType(laptopType type) {
        super(type);
    }

    @Override
    protected void construct() {
        System.out.println("building Window Type Laptop");

    }
}
