package Factory_pattern;


public abstract class Laptop {

    private LaptopType type;

    public Laptop(LaptopType type){
        this.type = type;



    }

    public Laptop() {

    }

    protected abstract void construct();

    public void setType(LaptopType type){
        this.type = type;

    }

    public LaptopType getType() {
        return type;
    }
}