package Factory_pattern;
public class WindowType extends Laptop {

    WindowType(){
        super(LaptopType.WINDOW);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("building Window Type Laptop");

    }
}
