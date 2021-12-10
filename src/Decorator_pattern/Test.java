package Decorator_pattern;

public class Test {
    public static void main(String[] args) {
        Clothing male_clothing = new MaleClothing();
        male_clothing = new MaleJacket_Decorator(male_clothing);
        System.out.println("Description: " + male_clothing.getDescription());
        System.out.println("Total Price € " + male_clothing.getTotalPrice());

        Clothing female_clothing = new FemaleClothing();
        female_clothing = new FemaleCardigans_Decorator(female_clothing);
        System.out.println("Description: " +female_clothing.getDescription());
        System.out.println("Total Price € " + female_clothing.getTotalPrice());

    }
}
