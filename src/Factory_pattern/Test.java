package Factory_pattern;

public class Test {
    public static void main(String[] args) {
        System.out.println(LaptopFactory.buildLaptop(LaptopType.WINDOW));
        System.out.println("\n");
        System.out.println(LaptopFactory.buildLaptop(LaptopType.APPLE));
    }

}
