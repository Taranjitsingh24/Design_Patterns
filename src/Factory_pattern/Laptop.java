package Factory_pattern;


public abstract class Laptop {

    private laptopType type;

    public Laptop(laptopType type){
        this.type = type;



    }
    protected abstract void construct();

    public void setType(laptopType type){
        this.type = type;

    }

    public laptopType getType() {
        return type;
    }
}