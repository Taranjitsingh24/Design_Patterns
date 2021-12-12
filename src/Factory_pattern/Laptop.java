package Factory_pattern;

public abstract class Laptop {


    private final LaptopType model;

    public Laptop(LaptopType model){
        this.model = model;
        
    }
    protected abstract void construct();

}
