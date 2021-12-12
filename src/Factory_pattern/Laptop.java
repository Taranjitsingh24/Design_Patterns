package Factory_pattern;

public abstract class Laptop {

    private LaptopType model ;


    public Laptop(LaptopType model){
        this.model = model;
        
    }

    protected abstract void construct();

    public LaptopType getModel() {
        return model;
    }

    public void setModel(LaptopType model) {
        this.model = model;
    }

}
