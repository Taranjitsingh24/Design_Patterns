package Factory_pattern;

public class AppleType extends Laptop {
    AppleType() {
        super(LaptopType.APPLE);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("building Apple Type Laptop");

    }
}
