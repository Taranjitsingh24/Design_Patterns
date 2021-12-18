package Factory_pattern;

public class LaptopFactory {
    public static Laptop buildLaptop(LaptopType model){
            Laptop laptop = null;
            switch(model){
                case WINDOW:
                    laptop = new WindowType();
                    break;
                case APPLE:
                    laptop = new WindowType();
                    break;
                default:
                    break;
            }
            return laptop;
    }

}
